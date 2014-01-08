package health.controller;

import health.employee.CommandFactory;
import health.factory.ICommand;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FrontController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");
		
		String nextPage ="";
		String uri = req.getRequestURI();
		String ctxPath = req.getContextPath();
		uri = uri.substring(ctxPath.length());
		
		if(uri.equals("/member.front")){
			nextPage = "/Member/Member.jsp";
		}
		else if(uri.equals("/etc.front")){
			nextPage = "/ETC/EtcManage.jsp";
		}
		else if(uri.equals("/employee.front")){
			nextPage = "/Employee/EmployeeManage.jsp";
		}
		else if(uri.equals("/notice.front")){
			nextPage = "/Notice/Notice.jsp";
		}
		else if(uri.equals("/account.front")){
			nextPage = "/Account/AccountManage.jsp";
		}
		else{
			
		}
		
		
		/*if(current != null && current.equals("complete") && command.equals("SAVE")){
			nextPage ="/exam3/alreadyRegister.jsp";
		}*/
		
		RequestDispatcher view = req.getRequestDispatcher(nextPage);
		view.forward(req, resp);
	}
	
}
