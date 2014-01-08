package health.etc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import health.factory.ICommand;

public class UpdateCommand implements ICommand {
	private String cmd;
	public UpdateCommand(String cmd){
		this.cmd = cmd;
	}

	@Override
	public Object ProcessCommand(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("updateCommand ���ӿϷ�");
		int etcno = Integer.parseInt(req.getParameter("etcno"));
		if(cmd.equals("UP")){
			EtcDao dao = new EtcDao();
			EtcDto dto = dao.getList(etcno);
			req.setAttribute("dto", dto);
			return "/ETC/EtcUpdate.jsp";			
		}
		else if(cmd.equals("UPDATE")){
			EtcDao dao = new EtcDao();
			EtcDto dto = new EtcDto();

			dto.setCode(req.getParameter("code"));
			dto.setDealno(Integer.parseInt(req.getParameter("dealno")));
			dto.setEtcname(req.getParameter("etcname"));
			dto.setEtcno(Integer.parseInt(req.getParameter("etcno")));
			dto.setFactory(req.getParameter("factory"));
			dto.setHno(Integer.parseInt(req.getParameter("hno")));
			dto.setPrice(Integer.parseInt(req.getParameter("price")));
			dto.setQuantity(Integer.parseInt(req.getParameter("quantity")));
			dto.setState(req.getParameter("state"));
			dao.UpdateEtc(dto,etcno);
			System.out.println("ETC������Ʈ�� �Ϸ�Ǿ����ϴ�.");
			return "/ETC/EtcManage.jsp";
		}
		else
			return null;
	}

}
