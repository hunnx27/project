<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page import="java.sql.*"%>
<jsp:include page="EmployeeManage.jsp" flush="true" />

<hr>
<h1>직원 LIST</h1>
<table width="1000" border="2">
	<tr>
		<td width="150" bgcolor="gray" align="center"><font
			color="#FFFFFF"><b>직원ID</b></font></td>
		<td width="200" bgcolor="gray" align="center"><font
			color="#FFFFFF"><b>이 름</b></font></td>
		<td width="300" bgcolor="gray" align="center"><font
			color="#FFFFFF"><b>주민번호</b></font></td>
		<td width="200" bgcolor="gray" align="center"><font
			color="#FFFFFF"><b>부 서</b></font></td>
		<td width="200" bgcolor="gray" align="center"><font
			color="#FFFFFF"><b>직 급</b></font></td>
		<td width="150" bgcolor="gray" align="center"><font
			color="#FFFFFF"><b>호 봉</b></font></td>
		<td width="400" bgcolor="gray" align="center"><font
			color="#FFFFFF"><b>입사일</b></font></td>
		<td width="400" bgcolor="gray" align="center"><font
			color="#FFFFFF"><b>연락처</b></font></td>
		<td width="300" bgcolor="gray" align="center"><font
			color="#FFFFFF"><b>Email</b></font></td>


	</tr>
	<%
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;

		try {
			String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:oracle";
			String dbID = "scott";
			String dbPwd = "tiger";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dbUrl, dbID, dbPwd);

			String sql = "SELECT * FROM member order by id";
			pStmt = con.prepareStatement(sql);
			rs = pStmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String jumin1 = rs.getString("jumin1");
				String jumin2 = rs.getString("jumin2");
				String part = rs.getString("part");
				String position = rs.getString("position");
				String career = rs.getString("career");
				Timestamp register = rs.getTimestamp("in_date");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
	%>
	<tr>
		<td width="200" align="center"><%=id%></td>
		<td width="200" align="center"><%=name%></td>
		<td width="300" align="center"><%=jumin1%>-<%=jumin2%></td>
		<td width="200" align="center"><%=part%></td>
		<td width="200" align="center"><%=position%></td>
		<td width="200" align="center"><%=career%></td>
		<td width="300" align="center"><%=register%></td>
		<td width="300" align="center"><%=tel%></td>
		<td width="300" align="center"><%=email%></td>
	</tr>
	<%
		}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception ee) {
				}
			if (pStmt != null)
				try {
					pStmt.close();
				} catch (Exception ee) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception ee) {
				}
		}
	%>
</table>

<hr>


