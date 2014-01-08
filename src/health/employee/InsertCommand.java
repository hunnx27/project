package health.employee;

import health.factory.ICommand;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InsertCommand implements ICommand {
	String cmd;
	public InsertCommand(String cmd){
		this.cmd = cmd;
	}
	@Override
	public Object ProcessCommand(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(cmd);
		if(cmd.equals("SAVE")){
			int career = Integer.parseInt(req.getParameter("career"));
			int sal =Integer.parseInt(req.getParameter("sal"));
			String birth1=req.getParameter("birth1");
			String birth2=req.getParameter("birth2");
			String birth3=req.getParameter("birth3");
			if(Integer.parseInt(birth2)<10){
				birth2="0"+birth2;
			}
			if(Integer.parseInt(birth3)<10){
				birth3="0"+birth3;
			}
			String ebirth = birth1+birth2+birth3;
			System.out.println(ebirth);
			
			EmployeeDto dto = new EmployeeDto();
			dto.setEname(req.getParameter("ename"));
			dto.setPname(req.getParameter("pname"));
			dto.setEbirth(ebirth);
			dto.setEgender(req.getParameter("egender"));
			dto.setCareer(career);
			dto.setSal(sal);
			
			EmployeeDao dao = new EmployeeDao();
			dao.Insert(dto,req,resp);
			
			HttpSession session = req.getSession(false);
			
			System.out.println(session.getAttribute("currentstate"));
			if(session.getAttribute("currentstate").equals("failed") || session.getAttribute("currentstate") == null){
				return "/Employee/EMPInsert.jsp";
			}
			else{
				return "/Employee/EmployeeManage.jsp";
			}
		}
		else if(cmd.equals("REG")){
			System.out.println("test");
			return "/Employee/EMPInsert.jsp";
		}
		else{
			return null;
		}
		
	}

}
