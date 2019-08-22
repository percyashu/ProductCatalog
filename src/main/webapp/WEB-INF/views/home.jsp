<%@include file ="../common/header.jspf"
%>
	<%@include file ="../common/nav.jspf"
%>
<div class="container">
		
	<div class ="container">
		<H1 class="text-center">Welcome ${username}</H1>
		<h2 class="text-left-align">Your Products  are </h2>  
			 
		        <table>
		        <c:forEach items="${catalogs}" var="catalog">
        <TR>
            <TD>Actor ID: </TD>
            <TD>${catalog.cname}</TD>
        </TR>
        
        <TR>
            <TD>Lastname: </TD>
            <TD>${catalog.cdescript}</TD>
        </TR>
         </c:forEach>
        </table>
	</div>
	<%@include file ="../common/footer.jspf"
%>