<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="EmployeeManage.jsp" flush="true" />
<!-- <script type="text/javascript">
function check(){
	alert("정말 삭제하시겠습니까?");
	
		return;
	document.search.submit();
	}
</script> -->
<font align="center"><li><b>티모 헬스장 직원삭제</b></font>
<br />
	<table border="1">
			<tr>
				<th>사원번호</th><th>이름</th><th>담당프로그램명</th><th>생일</th><th>성별</th><th>경력</th><th>급여</th>
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
	 <input type="button" value="삭제" onClick="check()">
</form>

<hr>
