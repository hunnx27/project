<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
	<!-- 
	private int etcno;  //자재번호
	private int dealno; //거래처번호
	private int hno; //헬스장번호
	private String etcname; //자재이름
	private String code; //구분코드
	private int price; //자재가격
	private int quantity; //수량
	private String state; //자재상태
	private String factory; //재조회사이름 	
	etcno	number,
	dealno	number,
	hno	number,
	etcname	varchar2(20)	not null,
	code	varchar2(20)	not null,
	price	number	not null,
	quantity	number	not null,
	state	varchar2(2)	not null,
	factory	varchar2(2)	not null,
	-->
	<h1>자재추가</h1>
	<hr/>
	
<form method="post" action="update_proc.etc?command=UPDATE">
	<table border="1">
		<tr>
			<td>자재번호(숫자)</td><td><input type="text" name="etcno" value="${dto.etcno }"/>
		</tr>
		<tr>
			<td>거래처번호(숫자)</td><td><input type="text" name="dealno" value="${dto.dealno}"/>
		</tr>
		<tr>
			<td>헬스장번호(숫자)</td><td><input type="text" name="hno" value="${dto.hno }"/>
		</tr>
		<tr>
			<td>자재이름</td><td><input type="text" name="etcname" value="${dto.etcname }"/>
		</tr>
		<tr>
			<td>구분코드</td><td><input type="text" name="code" value="${dto.code }"/>
		</tr>
		<tr>
			<td>자재가격(숫자)</td><td><input type="text" name="price" value="${dto.price }"/>
		</tr>
		<tr>
			<td>수량(숫자)</td><td><input type="text" name="quantity" value="${dto.quantity }"/>
		</tr>
		<tr>
			<td>자재상태</td><td><input type="text" name="state" value="${dto.state }"/>
		</tr>
		<tr>
			<td>재조회사이름</td><td><input type="text" name="factory" value="${dto.factory }"/>
		</tr>
		<input type="submit" value="수정"/>
	</table>
	</form>
	
</div>
</body>
</html>