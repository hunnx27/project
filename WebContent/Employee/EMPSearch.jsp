<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="EmployeeManage.jsp" flush="true" />
<script type="text/javascript">
function check(){
	if(document.search.keyWord.value == ""){
		alert("검색어를 입력하세요.");
		document.search.keyWord.focus();
		return;
	}
	document.search.submit();
	}
</script>

<hr>

<font align="center"><li><b>티모 헬스장 직원검색</b></font>
<br />
<form name="search" method="post" action="Search.employee">
	<input type="hidden" name="command" value="SEARCH"/>
	<select name="keyField" size="1">
				<option value="ename"> 이 름
				<option value="egender"> 성 별
				<option value="pname">담당프로그램명
			</select>

			<input type="text" size="16" name="keyWord" >
	 <input type="button" value="검색" onClick="check()">
</form>
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

<hr>
