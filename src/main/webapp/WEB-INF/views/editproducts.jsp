<%@include file ="../common/header.jspf"
%>
	<%@include file ="../common/nav.jspf"
%>

<form method="POST" action="/addProduct.do" enctype="multipart/form-data">
			
			<fieldset class="form-group">
			<label>Product Name</label>
			<input name="pname" type="text" class="form-control" /><BR/>
			</fieldset>
			<fieldset class="form-group">
			<label>Category Name  </label>
			<input name="cname" type="text" class="form-control" /><BR/>
			 </fieldset>
			 <fieldset class="form-group">
			<label>Image location  </label>
			<input type="file" name="photo" size="50"/><BR/>
			 </fieldset>
			 <input name="add"
				type="submit" class ="btn btn-success" value="Submit"/>
		</form>
		<table  class="table table-striped">
		<thead>
		<th>Product Name</th>
		<th>Category Name</th>
		<th>Product image</th>
		<th>Actions</th>
		</thead>
		<tbody>
		 <c:forEach items="${products}" var="product">
		<tr>
		
		<td>${product.pname}</td>
		<td>${product.cname}</td>
		<td><img  style="width:100px;height:50px" src="data:image/png;base64,${product.simage} " /></td>
		<td>&nbsp;&nbsp; 
		<a class="btn btn-primary"
		href="/modProduct.do?pid=${product.pid}">Edit</a></li>
		<a class="btn btn-danger"
		href="/deleteProduct.do?pid=${product.pid}">Delete</a></li>
		</td>
		</tr>
		</c:forEach>
		
		</tbody>
		</table>
		
	<%@include file ="../common/footer.jspf"
%>