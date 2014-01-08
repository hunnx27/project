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
			 * private int etcno;  //�����ȣ
			private int dealno; //�ŷ�ó��ȣ
			private int hno; //�ｺ���ȣ
			private String etcname; //�����̸�
			private String code; //�����ڵ�
			private int price; //���簡��
			private int quantity; //����
			private String state; //�������
			private String factory; //����ȸ���̸� 	
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
			System.out.println("INSERT����������");
			return "/ETC/EtcInsert.jsp";
		}
		return null;
	}

}
