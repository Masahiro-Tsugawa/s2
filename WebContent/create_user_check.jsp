<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新規登録確認</title>
	<jsp:include page="base/base.jsp" flush="true" />
  </head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
	<div class="container text-center">
		<h1>登録内容確認</h1>
		<hr>
		<p>以下の内容で情報を登録します。</p>
		<div align="center">
			<table class="table_check">
				<tr><th colspan="2">お客様情報確認</th></tr>
					<tr>
						<td>メール:</td>
						<td><s:property value="#session.userEmail" /></td>
					</tr>
					<tr>
						<td>氏名:</td>
						<td><s:property value="#session.userName" /></td>
					</tr>
					<tr>
						<td>氏名<br>(フリガナ):</td>
						<td><s:property value="#session.userKanaName" /></td>
					</tr>
					<tr>
						<td>郵便番号:</td>
						<td><s:property value="#session.userPostalCode" /></td>
					</tr>
					<tr>
						<td>住所:</td>
						<td><s:property value="#session.userAddress" /></td>
					</tr>
					<tr>
						<td>電話番号:</td>
						<td><s:property value="#session.userTelNum" /></td>
					</tr>
			</table>
		</div>
		<div>
		<s:form action="GoCreateUser"><s:submit cssClass="btn btn-danger" value="訂正" /></s:form>
		<s:form action="RegisterUserAction" ><s:submit cssClass="btn btn-danger" value="OK" /></s:form>
		</div>
	</div>
	<br>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>
