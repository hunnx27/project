package health.etc;

public class EtcDto {
	private int etcno;  //자재번호
	private int dealno; //거래처번호
	private int hno; //헬스장번호
	private String etcname; //자재이름
	private String code; //구분코드
	private int price; //자재가격
	private int quantity; //수량
	private String state; //자재상태
	private String factory; //재조회사이름
	
	public int getEtcno() {
		return etcno;
	}
	public void setEtcno(int etcno) {
		this.etcno = etcno;
	}
	public int getDealno() {
		return dealno;
	}
	public void setDealno(int dealno) {
		this.dealno = dealno;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getEtcname() {
		return etcname;
	}
	public void setEtcname(String etcname) {
		this.etcname = etcname;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	
	
}
