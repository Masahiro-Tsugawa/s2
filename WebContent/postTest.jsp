<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PostTest</title>
     <link rel="stylesheet" href="css/postTest.css" type="text/css">
    <script type="text/javascript" src="jquery-1.11.3.min.js"></script>
   <script type="text/javascript" src="js/postTest.js"></script>
  </head>
<body>
<!-- <s:url action="SessionClear" id="clearUrl"/>
<s:a href="%{clearUrl}"><input type="button" value="戻れーーーーーー！！"></s:a>
<s:if test="%{#session.userId == null}"> -->
<table id="noLogin">
<tr>
<td><input type="button" id="signUpBt" value="新規登録"></td>
<td><input type="button" id="loginBt" value="ログイン"></td>
</table>
<div id="message" style="color : red;"></div>
<table class="postForm" id="postForm">
<tr>
<td>ID<input type="text" name="formText" id="idForm"/></td>
</tr>
<tr>
<td>PS<input type="text" name="formText" id="passForm"/>
<input type="button" id="test" value="送信！" /></td>
</tr>
</table>
<div id="helloName"></div>
<table class="login" id="logined">
<tr>
<td><a href="https://www.google.co.jp/">マイページ</a></td>
<td><input type="button" id="logoutBt" value="ログアウト"></td>
</table>
<!-- </s:if> -->
</body>
</html>
