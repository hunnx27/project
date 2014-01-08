package health.etc;

import health.db.DBConn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EtcDao {
	PreparedStatement pstmt;
	ResultSet rs;
	DBConn db;
	Vector v = new Vector();
	
	public EtcDao(){
		db =  new DBConn();
	}
	/*private int etcno;  //자재번호
	private int dealno; //거래처번호
	private int hno; //헬스장번호
	private String etcname; //자재이름
	private String code; //구분코드
	private int price; //자재가격
	private int quantity; //수량
	private String state; //자재상태
	private String factory; //재조회사이름 	
*/	public void InsertEtc(EtcDto dto,HttpServletRequest req,HttpServletResponse resp){
		String sql = "Insert into etc(etcno,dealno,hno,etcname,code,price, quantity, state, factory)"
				+ " values(?,?,?,?,?,?,?,?,?)";
		try{
			System.out.println("InsertEtc접속완료");
			pstmt = db.con.prepareStatement(sql);
			pstmt.setInt(1, dto.getEtcno());
			pstmt.setInt(2, dto.getDealno());
			pstmt.setInt(3, dto.getHno());
			pstmt.setString(4, dto.getEtcname());
			pstmt.setString(5, dto.getCode());
			pstmt.setInt(6, dto.getPrice());
			pstmt.setInt(7, dto.getQuantity());
			pstmt.setString(8, dto.getState());
			pstmt.setString(9, dto.getFactory());
			pstmt.executeUpdate();
			System.out.println("InsertEtc업데이트성공");
		
		}
		catch(Exception err){
			System.out.println("insert etc : " + err);
		}
		finally{
			DBClose();
		}
	}
	
	public Vector getList(){
		String sql = "Select * from etc";
		
		try{
			System.out.println("getList접속완료");
			pstmt = db.con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				/*private int etcno;  //자재번호
				private int dealno; //거래처번호
				private int hno; //헬스장번호
				private String etcname; //자재이름
				private String code; //구분코드
				private int price; //자재가격
				private int quantity; //수량
				private String state; //자재상태
				private String factory; //재조회사이름 	
			*/	
				EtcDto dto = new EtcDto();
				dto.setEtcno(rs.getInt("etcno"));
				dto.setDealno(rs.getInt("dealno"));
				dto.setHno(rs.getInt("hno"));
				dto.setEtcname(rs.getString("etcname"));
				dto.setCode(rs.getString("code"));
				dto.setPrice(rs.getInt("price"));
				dto.setQuantity(rs.getInt("quantity"));
				dto.setState(rs.getString("state"));
				dto.setFactory(rs.getString("factory"));


				v.add(dto);
			}
		}
		catch(Exception err){
			System.out.println("EtcDao-getList()에서 에러 : " + err);
		}
		finally{
			DBClose();
		}
		
		return v;
	}
	
	public EtcDto getList(int etcno){
		String sql = "Select * from etc where etcno = " + etcno;
		EtcDto dto = new EtcDto();
		
		try{
			System.out.println("getList접속완료");
			pstmt = db.con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			
			dto.setEtcno(rs.getInt("etcno"));
			dto.setDealno(rs.getInt("dealno"));
			dto.setHno(rs.getInt("hno"));
			dto.setEtcname(rs.getString("etcname"));
			dto.setCode(rs.getString("code"));
			dto.setPrice(rs.getInt("price"));
			dto.setQuantity(rs.getInt("quantity"));
			dto.setState(rs.getString("state"));
			dto.setFactory(rs.getString("factory"));


		}
		catch(Exception err){
			System.out.println("EtcDao-getList(int)에서 에러 : " + err);
		}
		finally{
			DBClose();
		}
		
		return dto;
	}
	
	public Vector getList(String kf,String kw){
		String sql = "Select * from etc where " + kf + " like '%" + kw + "%'";
		System.out.println(sql);
		try{
			pstmt = db.con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				/*private int etcno;  //자재번호
				private int dealno; //거래처번호
				private int hno; //헬스장번호
				private String etcname; //자재이름
				private String code; //구분코드
				private int price; //자재가격
				private int quantity; //수량
				private String state; //자재상태
				private String factory; //재조회사이름 	
			*/	
				EtcDto dto = new EtcDto();
				dto.setEtcno(rs.getInt("etcno"));
				dto.setDealno(rs.getInt("dealno"));
				dto.setHno(rs.getInt("hno"));
				dto.setEtcname(rs.getString("etcname"));
				dto.setCode(rs.getString("code"));
				dto.setPrice(rs.getInt("price"));
				dto.setQuantity(rs.getInt("quantity"));
				dto.setState(rs.getString("state"));
				dto.setFactory(rs.getString("factory"));


				v.add(dto);
			}
		}
		catch(Exception err){
			System.out.println("EtcDao-getList(kf,kw)에서 에러 : " + err);
		}
		finally{
			DBClose();
		}
		return v;
	}
	
	public void UpdateEtc(EtcDto dto,int etcno){
		/*private int etcno;  //자재번호
		private int dealno; //거래처번호
		private int hno; //헬스장번호
		private String etcname; //자재이름
		private String code; //구분코드
		private int price; //자재가격
		private int quantity; //수량
		private String state; //자재상태
		private String factory; //재조회사이름 	
	*/	
		String sql =  "update etc "
					+ "set etcno=?, dealno=?, hno=?, etcname=?, code=?, price=?, quantity=?, state=?, factory=?"
					+ "where etcno = " + etcno;
		System.out.println(sql);
		try{
			pstmt = db.con.prepareStatement(sql);
			pstmt.setInt(1, dto.getEtcno());
			pstmt.setInt(2, dto.getDealno());
			pstmt.setInt(3, dto.getHno());
			pstmt.setString(4, dto.getEtcname());
			pstmt.setString(5, dto.getCode());
			pstmt.setInt(6, dto.getPrice());
			pstmt.setInt(7, dto.getQuantity());
			pstmt.setString(8, dto.getState());
			pstmt.setString(9, dto.getFactory());
			pstmt.executeUpdate();
			
		}
		catch(Exception err){
			System.out.println("ETCDao - UpdateEtc에서 에러 : " + err);
		}
		finally{
			DBClose();
		}
	}
	
	public void DelEtc(int etcno){
		String sql ="delete from etc where etcno = " + etcno;
		try{
			pstmt = db.con.prepareStatement(sql);
			pstmt.executeUpdate();
			System.out.println("삭제완료되었습니다.");
		}
		catch(Exception err){
			System.out.println("EtcDao - DelEtc(int)에서 에러 : " + err );
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
}
