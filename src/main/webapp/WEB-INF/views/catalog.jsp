<%@include file ="../common/header.jspf"
%>
	<%@include file ="../common/nav.jspf"
%>
<p><font color="red">${error}</p></font></p>
<form method="POST" action="/addCatalog.do">
			
			<fieldset class="form-group">
			<label>Category Name</label>
			<input name="ccname" type="text" class="form-control" /><BR/>
			</fieldset>
			<fieldset class="form-group">
			<label>Category Description  </label>
			<input name="ccdescript" type="text" class="form-control" /><BR/>
			 </fieldset>
			 <input name="add"
				type="submit" class ="btn btn-success" value="Submit"/>
		</form>
<table  class="table table-striped">
		<thead>
		<th>Catergory Name</th>
		<th>Category Description</th>
		<th>Actions</th>
		</thead>
		<tbody>
		 <c:forEach items="${catalogs}" var="catalog">
		<tr>
		
		<td>${catalog.cname}</td>
		<td>${catalog.cdescript}</td>
		<td>&nbsp;&nbsp; 
		<a class="btn btn-primary"
		href="/editCatalog.do?cname=${catalog.cname}&cdescript=${catalog.cdescript}">Edit</a></li>
		<a class="btn btn-danger"
		href="/deleteCatalog.do?cname=${catalog.cname}&cdescript=${catalog.cdescript}">Delete</a></li>
		</td>
		</tr>
		</c:forEach>
		
		</tbody>
		</table>
		<p>
			<font color="red">${errorMessage}</font>
		</p>		
		 
	</div>
	<%@include file ="../common/footer.jspf"
%>