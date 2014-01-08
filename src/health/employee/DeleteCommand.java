package health.employee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import health.factory.ICommand;

public class DeleteCommand implements ICommand{

	@Override
	public Object ProcessCommand(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDto dto = new EmployeeDto();
		int empno = Integer.parseInt(req.getParameter("empno"));
		dto.setEmpno(empno);
		EmployeeDao dao = new EmployeeDao();
		dao.delSawon(empno);;
		System.out.println(empno);
		HttpSession session = req.getSession(false);
		
		System.out.println(session.getAttribute("currentstate"));
		if(session.getAttribute("currentstate").equals("failed") || session.getAttribute("currentstate") == null){
			return "/Employee/EMPDelete.jsp";
		}
		else{
			return "/Employee/EmployeeManage.jsp";
		}
	}

}
