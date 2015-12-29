// ログインテーブルを表示
$(function(){
	$('#loginBt').on('click', function(event){
		$("#postForm").toggle();
	});
});

// ID,Passwordをアクションに送信
jQuery(function($) {
	var url = location.protocol;
	url += "/Struts2/LoginUser";
	$('#test').on('click', function(event) {
		var data = {
			loginEmail : $("#idForm").val(),
			loginPass : $("#passForm").val()
		};
		$.ajax({
			url : url,
			type : 'GET',
			data : data,
			datatype : 'json'
		}).done(function(data) {
			alert("性向！");
			$("#helloName").append("こんにちは、" + data + "さん");
			$("#message").append("ログインできた！");
			$("#noLogin").hide();
			$("#postForm").hide();
		}).fail(function(data) {
			$("#message").empty();
			$("#message").append("ログイン失敗！");
		})
	});
});

// ログアウト
$(function(){
	var url = location.protocol;
	url += "/Struts2/SessionClear";
	$("#logoutBt").on('click', function(event){
		event.preventDefault();
		$.ajax({
			url : url,
			type : 'post',
		}).done(function(data) {
			alert("成功！");
			
			$("#message").append("ログインできた！");
		}).fail(function(data) {
			$("#message").empty();
			$("#message").append("ログイン失敗！");
		})
	});
});