<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><title>Insert title here</title></head>
<body>
<div>
<form method="post" action="insert_proc.employee?command=SAVE">
	<table>
		<tr>
			<td colspan ="2"><h1>�����߰�</h1></td>
		</tr>
		<tr>
			<td>�̸�</td><td><input type="text" name="ename"/> </td>
			<tr>
			<td>������α׷���</td><td><input type="text" name="pname"/> </td>
		</tr>
		<tr>
			<td>����</td><td><select name="birth1">
				<c:forEach begin="1950" end="2013" var="year">
					<option value ="${year}">${year}</option>
				</c:forEach>
				</select>
				��&nbsp;&nbsp;
				<select name="birth2">
				<c:forEach begin="1" end="12" var="month">
					<option value ="${month}">${month}</option>��&nbsp;&nbsp;
				</c:forEach>
				</select>
				��&nbsp;&nbsp;
				<select name="birth3">
				<c:forEach begin="1" end="31" var="day">
					<option value ="${day }">${day}</option>
				</c:forEach>
			</select>��&nbsp;&nbsp;</td>
		</tr>
		<tr>
			<td>����</td><td><input type="radio" name="egender" value="M"/>����&nbsp;&nbsp;
			<input type="radio" name="egender" value="F"/>����</td>
		</tr>
		<tr>
			<td>���</td><td><input type="text" name="career"/> </td>
		</tr>
		<tr>
			<td>�޿�</td><td><input type="text" name="sal"/> </td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="�����߰�"></td>
		</tr>
		
		
	
		<input type="text" name="command" value="abc"/>
	</table>
	</form>
</div>
</body>
</html>