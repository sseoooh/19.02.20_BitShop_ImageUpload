<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/list.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">고객 목록</font>
 	</h1>
</div>
<div class="grid-item" id="content">
	<table id="cust_tab">
	  <tr>
	    <th>No.</th> 
	    <th>아이디</th>
	    <th>이름</th>
	    <th>주민등록번호</th>
	    <th>성별</th>
	    <th>핸드폰번호</th>
	    <th>우편번호</th>
	    <th>주소</th>
	    <th>상세주소</th>  
	  </tr>
	  
	  <c:forEach items="${list}"  var="cus" >
	  <tr>	 	  
		<td>${cus.rnum}</td>
	    <td>${cus.customerID}</td>
	    <td> <a href="${ctx}/customer.do?cmd=cus_retrieve&page=detail&customerID=${cus.customerID}">${cus.customerName}</a></td>
	   
	    <td>${cus.ssn}</td>
	    <td>남</td>
	    <td>${cus.phone}</td>
	    <td>${cus.postalcode}</td>
	    <td>${cus.city}</td>
	    <td>${cus.address}</td>
	  </tr>
	   </c:forEach>
	
	</table>
	
	<div style="height: 50px"></div>    
	<div class="center">
	  <div class="pagination">
	  <c:if test="${pagination.existPrev}">
		  <a href="${ctx}/customer.do?cmd=cus_list&page=list&page_num=${pagination.prevBlock}">&laquo;</a>	  
	  </c:if>
	  <c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" varStatus="status">
	  
	  	<c:choose>
	  		<c:when test="${pagination.pageNum eq status.index}">
	  			<a href="#" class='page active'>${status.index}</a>
	  		</c:when>
	  		<c:otherwise>
	  			<a href="#" class='page'>${status.index}</a>
	  		</c:otherwise>	
	  	</c:choose>
	  		
	
	  </c:forEach>	 
	  <c:if test="${pagination.existNext}">
	 	 <a href="${ctx}/customer.do?cmd=cus_list&page=list&page_num=${pagination.nextBlock}">&raquo;</a>
	  </c:if> 
	  
	  </div>
	</div>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
//class="active"
$('.page').click(function(){
alert('2페이지넘어감'+$(this).text());
location.assign('${ctx}/customer.do?cmd=cus_list&page=list&page_num='+$(this).text());

/*   
 pageNum, pageSize, c
 ?cmd=list&page=list&page_num=2&page_size=5
 <input type="hidden" name="cmd" value="access" />
   <input type="hidden" name="dir" value="customer" />
   <input type="hidden" name="page" value="list" /> 
   */

});

</script>