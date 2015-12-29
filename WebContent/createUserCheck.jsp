<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/breadTest.css" type="text/css">
<title>確認</title>
</head>
<body>
<s:property value="#session.signUpName"/>さん<br>
<s:property value="#session.signUpEmail"/><br>
<s:property value="#session.signUpPassword"/><br>
<s:property value="#session.signUpPostalCode"/><br>
<s:property value="#session.signUpAddress"/><br>
<s:property value="#session.signUpTelNum"/><br>
<s:property value="#session.signUpFormText"/>さん
<p>テスト</p>

<s:iterator value="url">



<s:iterator value="map">
<li><s:property value="value"/></li>
</s:iterator>

</s:iterator>
</body>
</html>