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

public class EmployeeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		HttpSession session = req.getSession(false);
		String current =(String)session.getAttribute("current");
		String command = req.getParameter("command");
		String nextPage = "";
		
		System.out.println(command);
		
		/*if(current != null && current.equals("complete") && command.equals("SAVE")){
			nextPage ="/exam3/alreadyRegister.jsp";
		}*/
		
		CommandFactory factory = CommandFactory.getInstance();
		ICommand cmd = factory.createCommand(command);
		nextPage = (String)cmd.ProcessCommand(req, resp);
		
		
		RequestDispatcher view = req.getRequestDispatcher(nextPage);
		
		view.forward(req, resp);
		
	}

}
