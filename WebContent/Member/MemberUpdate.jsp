<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><title>Insert title here</title></head>
<body>
	<form method="post" action="update.member">
		ȸ����ȣ : <input type="text" name="codename" value="0033" readonly/><br/>
		�̸� : <input type="text" name="mname" /><br/>
		�ֹι�ȣ : <input type="text" name="mname"  size="6" maxlength="6" readonly/> - 
					<input type="text" name="mname"  size="7"maxlength="7" readonly/><br/>
		
		������� : <select name="birthday">
		<%
		for(int i = 1950 ; i < 2014 ; i++){		
		%>
		<option value ="<%=i-1900%>"><%=i%></option>
		<%
		}
		%>
		</select> 
		
		���� : <input type="text" name="age" /><br/>
		��ȭ : <input type="text" name="phone" /><br/>
		�̸��� : <input type="text" name="email" /><br/>
		�ּ� : <input type="text" name="addr" /><br/>
		
	</form>
</body>
</html>