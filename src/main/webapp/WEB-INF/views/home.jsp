<%@include file ="../common/header.jspf"
%>
	<%@include file ="../common/nav2.jspf"
%>
<div class="container">
		
	<div class ="container">
		<H1 class="text-center">Welcome ${username}</H1>
		<h2 class="text-left-align">Your Products  are </h2>  
			 
		      
		 <div class="container-fluid">
    <div class="row">
      <c:forEach items="${products}" var="product">
      <div class="col-md-4 product-grid">
		<div class="image">
		<img  style="width:255px;height:255px" src="data:image/png;base64,${product.simage} " />
		</div> 
		<h3 class="text-left-align">${product.pname} </h3>
		<h4 class="text-left-align">${product.cname} </h4>        
		</div>
        
         </c:forEach>
       
	</div>
	<%@include file ="../common/footer.jspf"
%>