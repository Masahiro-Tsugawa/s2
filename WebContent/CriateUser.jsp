<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新規登録</title>
    <!-- CSSリンク  -->
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css" />
    <link href="css/header.css" rel="stylesheet" type="text/css" />
    <link href="css/footer.css" rel="stylesheet" type="text/css" />
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <link href="css/CriateUser.css" rel="stylesheet" type="text/css" />
    <!-- JSリンク -->
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
  </head>
  <jsp:include page="base/header.jsp" flush="true" />
  <body>
   <div align="center">
   <br><br>
   <s:form action="CreateUser2Action">
    <table class="table_user">
  <tr><th colspan="4"><font size="4">新規登録</font></th></tr>
  
  <tr>
   <td>氏名</td>
   <td colspan="4">氏 <s:textfield name="userNameSurname" class="test"  placeholder="例　御茶ノ水"/>
   　　名 <s:textfield name="userNameFirstName" class="test" placeholder="例　太郎" /></td>
  </tr>
  
  <tr>
   <td>カナ</td>
   <td colspan="4">氏 <s:textfield name="userKanaNameSurname" class="test"  placeholder="例　オチャノミズ"/>
   　　名 <s:textfield name="userKanaNameFirstName" class="test" placeholder="例　タロウ　" /></td>
  </tr>
  
   <tr>
   <td>メールアドレス</td>
   <td class="test2" colspan="2"><s:textfield name="userEmail" value="%{#session.userEmail}" placeholder="記入例　abcd@efg.com"/></td>
  </tr>
  
  <tr>
  <td>メールアドレス確認</td>
   <td class="test2" colspan="2"><s:textfield name="mail" placeholder="記入例　abcd@efg.com"/></td>
  </tr>
  
   <tr>
   <td>パスワード</td>
   <td class="test2" colspan="2"><s:textfield name="userPassword"/></td>
  </tr>
  
  <tr>
  <td>パスワード確認</td>
   <td class="test2" colspan="2"><s:textfield name="Password"/></td>
  </tr>
  
  <tr>
   <td>郵便番号</td>
   <td class="test2" colspan="2"><s:textfield name="userPostalCode"  placeholder="000-0000"/></td>
  </tr>
  
  <tr>
   <td>都道府県</td>
   <td class="test2" colspan="2"><s:textfield name="userAddressPrefecture" placeholder="記入例　東京都"/></td>
  </tr>
  
  <tr>
   <td>市町村区</td>
   <td class="test2" colspan="2"><s:textfield name="userAddressCity" placeholder="記入例　千代田区"/></td>
  </tr>
  
  <tr>	
   <td>番地など</td> 
   <td class="test2" colspan="2"><s:textfield name="userAddressOther" placeholder="記入例　霞ヶ関3-6-15"/></td>
  </tr>
  
  <tr>
   <td>電話番号</td>
   <td class="test2" colspan="2"><s:textfield name="userTelNum" placeholder="記入例　090-0000-0000"/></td>
  </tr>
  
  <tr>
     <td class="button" colspan="3">
      <s:submit cssclass="btn btn-danger" value="登録 "/>
      <s:form>
      <s:submit cssclass="btn btn-danger" value=" 取消 "/>
      </s:form>
     </td>
    </tr>
    </table>
    </s:form>
    </div>
	<br><br>
  </body>
    <jsp:include page="base/footer.jsp" flush="true" />
</html>
