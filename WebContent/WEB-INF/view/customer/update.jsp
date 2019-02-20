<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/detail.css" />
<div class="grid-item" id="navi_bar">
	<ul class="ul_navi_bar">
	    <li ><a href="home.do">홈으로</a></li>
	    <li ><a href="#">카테고리</a></li>
	    <li ><a href="#">사원</a></li>
	    <li ><a href="#">주문</a></li>
	    <li ><a href="#">상품</a></li>
	    <li ><a href="#">선박</a></li>
	    <li ><a href="#">공급업체</a></li>
	</ul>
</div>
<form id="form">
<div class="grid-item" id= "side_bar">
	<div class= "myphoto">
	<div class= "myphotoin"><img src="${img }/default.png"  style="height: 200px; width: 100%; "></div>
	</div>
</div>
    <div class="grid-item" id= "content">
	<div class ="mypage">
	<div class ="mypage1">
	아이디:<br />
	이름: <br />
	생년월일:<br />
	성별:<br />
	전화번호:<br />
	주소:<br />
	상세주소:<br />
	우편번호:<br />
	임시비밀번호: <br />
	</div>
	<div class ="mypage2">	
	${cus.customerID} <br />
	${cus.customerName} <br />
	${cus.ssn} <br />	
	성별 : 남 <br />
	<input type="text" name="phone" placeholder="${cus.phone}"/><br />
	<input type="text" name="city" placeholder="${cus.city}"/><br />
	<input type="text" name="address" placeholder="${cus.address}"/><br />
	<input type="text" name="postal_code" placeholder="${cus.postalcode}"/><br />
	<input type="text" name="password" placeholder="임시비밀번호"/><br />
	<input type="hidden" name="customer_id" value="${cus.customerID}"/><br />
	<input type="hidden" name="cmd" value="cus_update"/><br />
	<input type="hidden" name="page" value="detail"/><br />
	</div>
	</div>
	</div>
	</form>  
	<div class="grid-item">
	<span id="confirm_btn" class="label label-success">확인</span>
	<span id="cancle_btn" class="label label-danger">취소</span>

</div>  
  

<jsp:include page="../home/bottom.jsp"/> 
<script>
$('#confirm_btn').attr('style','cursor:pointer').click(function(){
	var form = $('#form');
	form.attr('action','${ctx}/customer.do');
	form.attr('method','post');
	form.submit();
	
	
});
$('#cancle_btn').click(function(){
	alert('취소버튼 클릭');
	
});
</script>        
          





<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/employee/register.css" />
검색한 사람의 정보<br />
아이디	 ${cus.customerID } <br />
이 름		${cus.customerName} <br />
생년월일	${cus.ssn} <br />	
성별 : 남 <br />
전화번호 : ${cus.phone}<br />	
우편번호 : ${cus.postalcode} <br />
주소 : 	${cus.city}<br />
상세주소 : ${cus.address}

 <jsp:include page="../home/bottom.jsp"/>
<script>

</script> --%>