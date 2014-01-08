<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<div>
	<h1>회원등록</h1>
	<hr/>
</div>
<div>
<form method="post" action="insert.member">
	이름 : <input type="text" name="mname" /><br/>
	생년월일 : <select name="birth">
	<%
	for(int i = 1950 ; i < 2014 ; i++){
	%>
	<option value ="<%=i-1900%>"><%=i%></option>
	<%
	}
	%>
	</select> 
	
	전화 : <input type="text" name="phone" /><br/>
	이메일 : <input type="text" name="email" /><br/>
	주소 : <input type="text" name="addr" /><br/>
</form>
</div>
</body>
</html>