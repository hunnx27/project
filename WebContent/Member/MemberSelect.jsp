<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><title>Insert title here</title></head>
<body>
<form method="post" action="select.member">
	<select name="select">
		<option value="이름">이름</option>
		<option value="번호">회원번호</option>
		<option value="연락처">연락처</option>
		<option value="성별">성별</option>
		<option value="주소">주소</option>
	</select>
	<input type="text" name="search"/>
</form>
<!--  DB에서 꺼내와 뿌려주는 부분 -->
<table border="1">
	
</table>

</body>
</html>