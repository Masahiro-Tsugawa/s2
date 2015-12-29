<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PostTest</title>

  </head>
<body>
<s:url action="TestTest" id="testtest"></s:url>
<s:a href="%{testtest}">テスト</s:a>
</body>
</html>
