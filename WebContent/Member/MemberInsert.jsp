<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<div>
	<h1>ȸ�����</h1>
	<hr/>
</div>
<div>
<form method="post" action="insert.member">
	�̸� : <input type="text" name="mname" /><br/>
	������� : <select name="birth">
	<%
	for(int i = 1950 ; i < 2014 ; i++){
	%>
	<option value ="<%=i-1900%>"><%=i%></option>
	<%
	}
	%>
	</select> 
	
	��ȭ : <input type="text" name="phone" /><br/>
	�̸��� : <input type="text" name="email" /><br/>
	�ּ� : <input type="text" name="addr" /><br/>
</form>
</div>
</body>
</html>