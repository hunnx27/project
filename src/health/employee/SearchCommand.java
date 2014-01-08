package health.employee;

import health.factory.ICommand;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchCommand implements ICommand {
	
	@Override
	public Object ProcessCommand(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String kw = req.getParameter("keyWord");
			String kf = req.getParameter("keyField");
			System.out.println(kw + "," + kf);
			
			Vector v = new EmployeeDao().getList(kf, kw);
			
			HttpSession session = req.getSession(false);
			session.setAttribute("currentstate", "complete");
			req.setAttribute("list", v);
			
			return "/Employee/EMPSearch.jsp";
	}

}
