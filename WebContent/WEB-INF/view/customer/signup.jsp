<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/signin.css" />
<div class="grid-item" id="side_menu">
	<h1><font style="font-size: 30px">회원가입</font></h1>
</div>

<div class="grid-item" id="content">
<form id="form" name="form" >
	<!-- <div class="grid-container"> -->
	<div class="input-group input-group-lg">
  <span class="input-group-addon" id="customerID">회원아이디</span>
  <input type="text" id="customerID" placeholder="회원아이디" aria-describedby="sizing-addon1">
  </div>
  
  <div class="input-group input-group-lg">
  <span class="input-group-addon" id="customerName">회원이름</span>
  <input type="text" id="customerName" placeholder="회원이름" aria-describedby="sizing-addon1">
    </div>
    
  <div class="input-group input-group-lg">  
  <span class="input-group-addon" id="password">비밀번호</span>
  <input type="text" id="password" placeholder="비밀번호" aria-describedby="sizing-addon1">
    </div>
    
    <div class="input-group input-group-lg">  
  <span class="input-group-addon" id="ssn">주민등록번호</span>
  <input type="text" id="ssn" placeholder="주민등록번호" aria-describedby="sizing-addon1">
    </div>
    
    <div class="input-group input-group-lg">  
  <span class="input-group-addon" id="photo">사진</span>
  <input type="text" id="photo" placeholder="사진" aria-describedby="sizing-addon1">
    </div>
    
    <div class="input-group input-group-lg">  
  <span class="input-group-addon" id="phone">핸드폰번호</span>
  <input type="text" id="phone" placeholder="핸드폰번호" aria-describedby="sizing-addon1">
    </div>    
    
  <div class="input-group input-group-lg">  
  <span class="input-group-addon" id="city">지번주소</span>
  <input type="text" id="city" placeholder="지번주소" aria-describedby="sizing-addon1">
    </div>
    
   <div class="input-group input-group-lg"> 
  <span class="input-group-addon" id="address">상세주소</span>
  <input type="text" id="address" placeholder="상세주소" aria-describedby="sizing-addon1">
      </div>
      
  <div class="input-group input-group-lg">    
  <span class="input-group-addon" id="postalcode">우편번호</span>
  <input type="text" id="postalcode" placeholder="우편번호" aria-describedby="sizing-addon1">
    </div>  

  </div>
  
	
	
	
	<div class="row">
  <div class="col-lg-6">
    <div class="input-group">
      <span class="input-group-btn">
        <button class="btn btn-default" type="button" id="confirm_btn">확인</button>
      </span>    
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
  </div><!-- /.row -->
  <div class="col-lg-6">
    <div class="input-group">
      
     
      <span class="input-group-btn">
        <button class="btn btn-default" type="button" id="cancel_btn">취소</button>
      </span>
      
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
</div><!-- /.row -->

		<input type="hidden" name="cmd" value="signup" />
	    <input type="hidden" name="dir" value="customer" />
	    <input type="hidden" name="page" value="signin" />
</form>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var customerID = $('#customerID').val();
	var customerName = $('#customerName').val();
	var password = $('#password').val();
	var phone = $('#phone').val();
	var address = $('#address').val();
	var city = $('#city').val();
	var postalcode = $('#postalcode').val();
	var ssn = $('#ssn').val();
	
	$('#form')
	.attr('action', '${ctx}/customer.do')
	.submit();
});
</script>