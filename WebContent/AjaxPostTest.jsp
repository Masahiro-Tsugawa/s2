<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.11.3.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#myForm').submit(function(event){
		// HTMLでの送信をキャンセル
        event.preventDefault();
		var from = $('#myForm')
		$.ajax({
			type: 'post',
			data: {comment : 'form'},
		datatype: 'json'	
		}).done(function(data){
			alert('成功！');
		});
	});
});
</script>
</head>
<body>
<s:form id="myForm" name="myForm" method="post" action="CreateUserAction">
<s:textfield name="text" id="formText"/>
<s:submit id="submitBtn" value="そうしん！" />
</s:form>
</body>
</html>