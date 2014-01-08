<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><title>Insert title here</title></head>
<body>
	<form method="post" action="update.member">
		회원번호 : <input type="text" name="codename" value="0033" readonly/><br/>
		이름 : <input type="text" name="mname" /><br/>
		주민번호 : <input type="text" name="mname"  size="6" maxlength="6" readonly/> - 
					<input type="text" name="mname"  size="7"maxlength="7" readonly/><br/>
		
		생년월일 : <select name="birthday">
		<%
		for(int i = 1950 ; i < 2014 ; i++){		
		%>
		<option value ="<%=i-1900%>"><%=i%></option>
		<%
		}
		%>
		</select> 
		
		나이 : <input type="text" name="age" /><br/>
		전화 : <input type="text" name="phone" /><br/>
		이메일 : <input type="text" name="email" /><br/>
		주소 : <input type="text" name="addr" /><br/>
		
	</form>
</body>
</html>