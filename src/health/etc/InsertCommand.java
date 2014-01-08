package health.etc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import health.factory.ICommand;

public class InsertCommand implements ICommand {
	
	private String cmd ;
	public InsertCommand(String cmd){
		this.cmd = cmd;
	}
	
	//public InsertCommand(){};
	
	@Override
	public Object ProcessCommand(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		if(cmd.equals("SAVE")){
			/*
			 * private int etcno;  //자재번호
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
			dto.setCode(req.getParameter("code"));
			dto.setDealno(Integer.parseInt(req.getParameter("dealno")));
			dto.setEtcname(req.getParameter("etcname"));
			dto.setEtcno(Integer.parseInt(req.getParameter("etcno")));
			dto.setFactory(req.getParameter("factory"));
			dto.setHno(Integer.parseInt(req.getParameter("hno")));
			dto.setPrice(Integer.parseInt(req.getParameter("price")));
			dto.setQuantity(Integer.parseInt(req.getParameter("quantity")));
			dto.setState(req.getParameter("state"));
			
			EtcDao dao = new EtcDao();
			dao.InsertEtc(dto, req, resp);
			
			
			return "/ETC/EtcManage.jsp";
		}
		else if(cmd.equals("REG")){
			System.out.println("INSERT이프문접속");
			return "/ETC/EtcInsert.jsp";
		}
		return null;
	}

}
