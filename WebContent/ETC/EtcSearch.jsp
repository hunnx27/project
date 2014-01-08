<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
function check(){
	if(document.search.keyWord.value == ""){
		alert("검색어를 입력하세요.");
		document.search.keyWord.focus();
		return;
	}
	document.search.submit();
}
function check2(etcno){
	if(confirm("정말 지우시겠습니까?")){
		location.href = "delete.etc?etcno=" + etcno + "&command=DEL";
	}
	else{
		
	}
}
</script>

<hr>

<font align="center"><li><b>티모 헬스장 직원검색</b></font>
<br />
<form name="search" method="post" action="Search.etc">
	<input type="hidden" name="command" value="SEARCH"/>
	<select name="keyField" size="1">
				<option value="code">구분코드
				<option value="etcname">자재이름
				<option value="state">자재상태
			</select>

			<input type="text" size="16" name="keyWord" >
	 <input type="button" value="검색" onClick="check()">
</form>
<!-- private int etcno;  //자재번호
	private int dealno; //거래처번호
	private int hno; //헬스장번호
	private String etcname; //자재이름
	private String code; //구분코드
	private int price; //자재가격
	private int quantity; //수량
	private String state; //자재상태
	private String factory; //재조회사이름  -->
	<table border="1">
			<tr>
				<th>자재번호</th><th>거래처번호</th><th>헬스장번호</th><th>자재이름</th><th>구분코드</th><th>자재가격</th><th>수량</th>
				<th>재조상태</th><th>재조회사이름</th><th>수정</th><th>삭제</th>
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
					<td><a href="modify.etc?etcno=${l.etcno }&command=UP">수정</a></td>
					<td><a href="javascript:check2(${l.etcno });">삭제</a></td>
				</tr>
			</c:forEach>
	</table>

<hr>
