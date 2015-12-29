<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!--  <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN"> -->
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/main2.css" type="text/css">
<link rel="stylesheet" href="css/createUser.css" type="text/css">

<title>うきうきUtopia 登録確認画面</title>
<!--[if lt IE 9]>
  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="./footerFixed.js"></script>
<style type="text/css">
</style>
</head>
<body>

	<!--ヘッダーにロゴを表示-->
	<header class="header">
		<div class="logo">
			<a href="index.html" target="_self "><img
				src="image/ukiukiblack2.png" alt="うきうきUtopia"></a>
		</div>
	</header>

	<!--Bodyの位置をラベリング-->
	<div class="container">

		<script src="jquery-1.11.3.min.js" type="text/javascript">
			
		</script>
		<script src="//jpostal.googlecode.com/svn/trunk/jquery.jpostal.js"
			type="text/javascript"></script>
		<script src="js/postCode.js" type="text/javascript"></script>


		<!--情報入力のダイアログボックスを作る-->
		<div class="create">
			<s:form action="CreateUserAction">
					<tr>
						<th colspan="2">新規登録</th>
					</tr>
					<tr>
						<td colspan="2"><s:textfield label="氏名" name="userName"
								placeholder="記入例　御茶ノ水　太郎" /></td>
					</tr>
					<tr>
						<td class="mail" colspan="2"><s:property
								value="getErrorMail()" /> <s:textfield label="メールアドレス"
								name="userEmail" placeholder="記入例　abcd@efg.com" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:textfield label="メールアドレス（確認） "
								name="confirmUserEmail" /></td>
					</tr>


					<tr>
						<td colspan="2"><s:password label="パスワード" name="userPassword"
								maxlength="32" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:password label="パスワード（確認）"
								name="confirmUserPassword" maxlength="32" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:textfield label="郵便番号(ハイフン必須)"
								id="postcode" name="userPostalCode" maxlength="8">
							</s:textfield></td>
					</tr>


					<tr>
						<td colspan="2"><s:textfield label="都道府県" id="address1"
								name="userAddress1" placeholder="記入例　東京都" /></td>
					</tr>
					<tr>

						<td colspan="2"><s:textfield label="市町村区番地" id="address2"
								name="userAddress2" placeholder="記入例　千代田区霞ヶ関3-6-15" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:textfield label="マンション等"
								name="userAddress3" placeholder="記入例　霞ヶ関MH タワーズ7F" /></td>
					</tr>

					<tr>
						<td colspan="2"><s:textfield label="電話番号" name="userTelNum"
								placeholder="記入例 00-0000-0000" /></td>
					</tr>


					<tr>
						<td colspan="3"><s:submit value="確認" /></td>
					</tr>
				</table>
			</s:form>

			<script type="text/javascript">
				$(function() {
					$('#test').on('click', function(event) {
						// HTMLでの送信をキャンセル
						event.preventDefault();
						var data = {
							comment : $("#formText").val()
						};
						$.ajax({
							url : 'http://localhost:8080/Struts2/test',
							type : 'post',
							data : data,
							datatype : 'json'
						}).done(function(data) {
							alert('成功！');
						});

					});
				});
			</script>
			<form id="myForm" name="myForm">
				<input type="text" id="formText" name="text" />
				<button id="test" type="button">送信</button>
			</form>

			<script type="text/javascript">
				$(function() {
					$('#getButton').on('click', function(event) {
						$.ajax({
							url : 'http://localhost:8080/Struts2/comment_up',
							type : 'get',
							dataType : 'text',
							data : 'comment'
						}).done(function(json) {
							$("#commentDiv").append(data);
							alert('ok');
						}).fail(function(data) {
							alert('ゴミ');
						});
					});
				});
			</script>
		
			<button type="button" id="getButton" name="getButton">読み取り</button>
			<div id="commentDiv"></div>

		</div>
	</div>






	<div>
		<!--フッターを表示-->
		<footer class="footer">
			Copyright © <a href="index.html" target="_blank">うきうきUtopia HOME</a>
			All Right Reserved.
		</footer>
	</div>
</body>




</html>
