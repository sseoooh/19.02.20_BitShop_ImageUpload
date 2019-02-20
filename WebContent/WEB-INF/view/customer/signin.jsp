<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/employee/register.css" />
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">로그인</font></h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
	<div class="grid-container">
	
	
	
	    <div class="grid-item" id="item_1">아이디</div>
	    <div class="grid-item" id="item_2"><input type="text" id="customerID" name="customerID" ></div>
	    <div class="grid-item" id="item_3">비밀번호</div>
	    <div class="grid-item" id="item_4"><input type="text" id="password" name="password" ></div>
	    <div class="grid-item" id="item_5"><input type="submit" id="cancel_btn" value='취소'></div>
	    <div class="grid-item" id="item_6"><input type="reset" id="confirm_btn" value='로그인'> </div>
	    <input type="hidden" name="cmd" value="signin" />
	    <input type="hidden" name="dir" value="category" />
	    <input type="hidden" name="page" value="main" />
	    
	</div>
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var customerID = $('#customerID').val();
	var password = $('#password').val();
	$('#form')
	.attr('action', '${ctx}/customer.do')
	.submit();
});
</script>
