<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="EmployeeManage.jsp" flush="true" />
<!-- <script type="text/javascript">
function check(){
	alert("���� �����Ͻðڽ��ϱ�?");
	
		return;
	document.search.submit();
	}
</script> -->
<font align="center"><li><b>Ƽ�� �ｺ�� ��������</b></font>
<br />
	<table border="1">
			<tr>
				<th>�����ȣ</th><th>�̸�</th><th>������α׷���</th><th>����</th><th>����</th><th>���</th><th>�޿�</th>
			</tr>
			<c:forEach var = "l" items ="${list}" >
				<tr>
					<td>${l.empno }</td>
					<td>${l.ename }</td>
					<td>${l.pname }</td>
					<td>${l.ebirth }</td>
					<td>${l.egender }</td>
					<td>${l.career }</td>
					<td>${l.sal }</td>

				</tr>
			</c:forEach>
	</table>
	<br/>
	<hr/>
	
	<form name="delete" method="post" action="Delete.employee">
	<input type="hidden" name="command" value="DELETE"/>
	
	<input type="text" size="16" name="keyWord" >
	 <input type="button" value="����" onClick="check()">
</form>

<hr>
