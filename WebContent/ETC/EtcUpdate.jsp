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
	private int etcno;  //�����ȣ
	private int dealno; //�ŷ�ó��ȣ
	private int hno; //�ｺ���ȣ
	private String etcname; //�����̸�
	private String code; //�����ڵ�
	private int price; //���簡��
	private int quantity; //����
	private String state; //�������
	private String factory; //����ȸ���̸� 	
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
	<h1>�����߰�</h1>
	<hr/>
	
<form method="post" action="update_proc.etc?command=UPDATE">
	<table border="1">
		<tr>
			<td>�����ȣ(����)</td><td><input type="text" name="etcno" value="${dto.etcno }"/>
		</tr>
		<tr>
			<td>�ŷ�ó��ȣ(����)</td><td><input type="text" name="dealno" value="${dto.dealno}"/>
		</tr>
		<tr>
			<td>�ｺ���ȣ(����)</td><td><input type="text" name="hno" value="${dto.hno }"/>
		</tr>
		<tr>
			<td>�����̸�</td><td><input type="text" name="etcname" value="${dto.etcname }"/>
		</tr>
		<tr>
			<td>�����ڵ�</td><td><input type="text" name="code" value="${dto.code }"/>
		</tr>
		<tr>
			<td>���簡��(����)</td><td><input type="text" name="price" value="${dto.price }"/>
		</tr>
		<tr>
			<td>����(����)</td><td><input type="text" name="quantity" value="${dto.quantity }"/>
		</tr>
		<tr>
			<td>�������</td><td><input type="text" name="state" value="${dto.state }"/>
		</tr>
		<tr>
			<td>����ȸ���̸�</td><td><input type="text" name="factory" value="${dto.factory }"/>
		</tr>
		<input type="submit" value="����"/>
	</table>
	</form>
	
</div>
</body>
</html>