<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><title>Insert title here</title></head>
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
	
<form method="post" action="insert_proc.etc?command=SAVE">
	<table border="1">
		<tr>
			<td>�����ȣ(����)</td><td><input type="text" name="etcno"/>
		</tr>
		<tr>
			<td>�ŷ�ó��ȣ(����)</td><td><input type="text" name="dealno"/>
		</tr>
		<tr>
			<td>�ｺ���ȣ(����)</td><td><input type="text" name="hno"/>
		</tr>
		<tr>
			<td>�����̸�</td><td><input type="text" name="etcname"/>
		</tr>
		<tr>
			<td>�����ڵ�</td><td><input type="text" name="code"/>
		</tr>
		<tr>
			<td>���簡��(����)</td><td><input type="text" name="price"/>
		</tr>
		<tr>
			<td>����(����)</td><td><input type="text" name="quantity"/>
		</tr>
		<tr>
			<td>�������</td><td><input type="text" name="state"/>
		</tr>
		<tr>
			<td>����ȸ���̸�</td><td><input type="text" name="factory"/>
		</tr>
		<input type="submit" value="�߰�"/>
	</table>
	</form>
	
</div>
</body>
</html>