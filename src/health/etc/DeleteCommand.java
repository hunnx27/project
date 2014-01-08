package health.etc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import health.factory.ICommand;

public class DeleteCommand implements ICommand{
	String cmd;
	public DeleteCommand(String cmd){
		this.cmd = cmd;
	}
	
	@Override
	public Object ProcessCommand(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		EtcDao dao = new EtcDao();
		dao.DelEtc(Integer.parseInt(req.getParameter("etcno")));
		return "/ETC/EtcSearch.jsp";
	}

}
