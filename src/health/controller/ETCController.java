package health.controller;

import health.etc.CommandFactory;
import health.factory.ICommand;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ETCController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		
		String command = req.getParameter("command");
		String nextPage ="";
		String uri = req.getRequestURI();
		String ctxPath = req.getContextPath();
		uri = uri.substring(ctxPath.length());
		/*
		 * 
		<li><a href="insert.etc">�����߰�</a></li>
		<li><a href="select.etc">������ȸ</a></li>
		<li><a href="order.etc">�����ֹ�</a></li>
		 */
		/*
		if(uri.equals("/ETC/insert.etc")){
			System.out.println("if connect");
			nextPage = "/ETC/EtcInsert.jsp";
		}
		else if(uri.equals("/ETC/select.etc")){
			nextPage = "/ETC/EtcSelect.jsp";
		}
		else if(uri.equals("/ETC/order.etc")){
			nextPage = "/ETC/EtcOrder.jsp";
		}
		else{
			//������ ���õ� ó��(����ڵ�
		}
		*/
		CommandFactory factory = CommandFactory.getInstance();
		ICommand cmd = factory.createCommand(command);
		nextPage = (String)cmd.ProcessCommand(req, resp);
		
		RequestDispatcher view = req.getRequestDispatcher(nextPage);
		view.forward(req, resp);
	}

}
