<%@include file ="../common/header.jspf"
%>
	<%@include file ="../common/nav.jspf"
%>

<form method="POST" action="/modProduct.do" enctype="multipart/form-data">
			
			<fieldset class="form-group">
			<label>Product Name </label>
			<input name="ppname" type="text" class="form-control" /><BR/>
			</fieldset>
			<fieldset class="form-group">
			<label>Category Name  </label>
			<input name="ccname" type="text" class="form-control" /><BR/>
			 </fieldset>
			 <fieldset class="form-group">
			<label>Image location  </label>
			<input type="file" name="photo" size="50"/><BR/>
			 </fieldset>
			 <input name="add"
				type="submit" class ="btn btn-success" value="Submit"/>
		</form>
		
			
	<%@include file ="../common/footer.jspf"
%>