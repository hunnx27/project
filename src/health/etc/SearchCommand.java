package health.etc;

import health.factory.ICommand;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchCommand implements ICommand {
	
	private String cmd;
	public SearchCommand(String cmd){
		this.cmd = cmd;
	}
	
	@Override
	public Object ProcessCommand(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String kw = req.getParameter("keyWord");
			String kf = req.getParameter("keyField");
			System.out.println(kw + "," + kf);
			Vector v = null;
			if(kw == null || kw.isEmpty()){
				System.out.println("키워드가 비웠소");
				v = new EtcDao().getList();				
			}
			else{
				v = new EtcDao().getList(kf, kw);
			}
			
			HttpSession session = req.getSession(false);
			session.setAttribute("currentstate", "complete");
			req.setAttribute("list", v);
			
			return "/ETC/EtcSearch.jsp";
	}

}