<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
function check(){
	if(document.search.keyWord.value == ""){
		alert("�˻�� �Է��ϼ���.");
		document.search.keyWord.focus();
		return;
	}
	document.search.submit();
}
function check2(etcno){
	if(confirm("���� ����ðڽ��ϱ�?")){
		location.href = "delete.etc?etcno=" + etcno + "&command=DEL";
	}
	else{
		
	}
}
</script>

<hr>

<font align="center"><li><b>Ƽ�� �ｺ�� �����˻�</b></font>
<br />
<form name="search" method="post" action="Search.etc">
	<input type="hidden" name="command" value="SEARCH"/>
	<select name="keyField" size="1">
				<option value="code">�����ڵ�
				<option value="etcname">�����̸�
				<option value="state">�������
			</select>

			<input type="text" size="16" name="keyWord" >
	 <input type="button" value="�˻�" onClick="check()">
</form>
<!-- private int etcno;  //�����ȣ
	private int dealno; //�ŷ�ó��ȣ
	private int hno; //�ｺ���ȣ
	private String etcname; //�����̸�
	private String code; //�����ڵ�
	private int price; //���簡��
	private int quantity; //����
	private String state; //�������
	private String factory; //����ȸ���̸�  -->
	<table border="1">
			<tr>
				<th>�����ȣ</th><th>�ŷ�ó��ȣ</th><th>�ｺ���ȣ</th><th>�����̸�</th><th>�����ڵ�</th><th>���簡��</th><th>����</th>
				<th>��������</th><th>����ȸ���̸�</th><th>����</th><th>����</th>
			</tr>
			<c:forEach var = "l" items ="${list}" >
				<tr>
					<td>${l.etcno }</td>
					<td>${l.dealno }</td>
					<td>${l.hno }</td>
					<td>${l.etcname }</td>
					<td>${l.code }</td>
					<td>${l.price }</td>
					<td>${l.quantity }</td>
					<td>${l.state }</td>
					<td>${l.factory }</td>
					<td><a href="modify.etc?etcno=${l.etcno }&command=UP">����</a></td>
					<td><a href="javascript:check2(${l.etcno });">����</a></td>
				</tr>
			</c:forEach>
	</table>

<hr>
