package health.employee;

import health.db.DBConn;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeDao{
	PreparedStatement pstmt;
	ResultSet rs;
	DBConn db;
	public EmployeeDao(){
		db =  new DBConn();
		System.out.println(db);
	}
	public void Insert(EmployeeDto dto, HttpServletRequest req, HttpServletResponse resp){
		String sql = "insert into emp(empno,hno,ename, pname, egender,ebirth,career,sal) values(emp_seq.nextval,1,?,?,?,?,?,?)";
		
		
		try{
			System.out.println(dto.getEbirth());
			System.out.println(dto.getCareer());
			System.out.println(dto.getEgender());
			System.out.println(dto.getEname());
			System.out.println(dto.getPname());
			System.out.println(dto.getSal());
			
			pstmt = db.con.prepareStatement(sql);
			pstmt.setString(1, dto.getEname());
			pstmt.setString(2, dto.getPname());
			pstmt.setString(3, dto.getEgender());
			pstmt.setString(4, dto.getEbirth());
			pstmt.setInt(5, dto.getCareer());
			pstmt.setInt(6, dto.getSal());
			pstmt.executeUpdate();
			
			HttpSession session = req.getSession(false);
			session.setAttribute("currentstate", "complete");
		}
		catch(Exception err){
			System.out.println("InsertSawon()에서 오류 : " + err);
			HttpSession session = req.getSession(false);
			session.setAttribute("currentstate", "failed");
		}
		finally{
			DBClose();
		}
	}
	
	public void DBClose(){
		if(rs != null){
			try{ rs.close(); }catch(Exception err){}
		}
		
		if(pstmt != null){
			try{ pstmt.close();	}catch(Exception err){}
		}
		
		if(db.con != null){
			try{ db.con.close(); }catch(Exception err){}
		}
	}
	
	public Vector getList(String kf, String kw){
		String sql = "";
		Vector v = new Vector();
		System.out.println(kf+"  "+kw);
		
		try{
			if(kw ==null || kw.isEmpty()){
				sql ="select * from emp";
			} else{
				sql = "select * from emp where "+ kf + " like'%" +kw + "%'";
			}
			System.out.println(sql);
			pstmt = db.con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				EmployeeDto dto = new EmployeeDto();
				dto.setHno(rs.getInt("hno"));
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setEbirth(rs.getString("ebirth").substring(0,10));
				dto.setPname(rs.getString("pname"));
				dto.setEgender(rs.getString("egender"));
				dto.setCareer(rs.getInt("career"));
				dto.setSal(rs.getInt("sal"));
				v.add(dto);
				System.out.println(rs.getString("ebirth"));
			}
		} catch(Exception err){
		System.out.println("글쓰기 오류 : " + err);
		}
		finally{
			DBClose();
		}
		return v;
	}
	
	// 사원 삭제
	public void delSawon(int no){
		try{
			
			String sql = "delete from emp where empno=?";
			pstmt = db.con.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		}
		catch(Exception err){
			System.out.println("delSawon()에서 오류 : " + err);
		}
		finally{
			DBClose();
		}
	}

}

