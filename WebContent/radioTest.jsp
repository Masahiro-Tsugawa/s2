<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery-1.11.3.min.js"></script>
<link rel="stylesheet" href="css/testRadio.css" type="text/css">
<title>RadioTest</title>
<script type="text/javascript">
	$(function() {
		$("input[id='testRadio']:radio").change(function() {
			if ($("input[id='testRadio']:checked").val() == 0) {
		        // 表示
		        $('#testId').show();
		    }
		    else {
		        // 非表示
		        $('#testId').hide();
		    }
		});
	});
</script>

</head>
<body>
	<input type="radio" id="testRadio" name="testRadio" value="0"
		checked="checked">表示
	<input type="radio" id="testRadio" name="testRadio" value="1">非表示
	<br>

<table>
<tr>
<td class="testId2" id="testId">雑魚は消えろーー！！！</td>
</tr>
</table>

</body>
</html>