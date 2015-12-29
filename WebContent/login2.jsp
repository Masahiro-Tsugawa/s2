<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>　
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.struts2.properties.LoginAction" var ="lang" />

<style type="text/css">
<!--
.errorMessage {
	color: red;
}
-->
</style>
</head>
<body>
	<s:form action="LoginAction">
	<fmt:message key ="id" bundle="${lang}" />
	<s:textfield  name="id" />
		<fmt:message key="passinfo" bundle="${lang}" />
		<s:password name="password" maxlength="16"/>
		<s:submit value="確認" />
	</s:form>

</body>
</html>