<%@include file ="../common/header.jspf"
%>
	<%@include file ="../common/nav.jspf"
%>
<h1>Edit ${cpname} category </h1>
<form method="POST" action="/editCatalog.do">
			
			<fieldset class="form-group">
			<label>New Category Name</label>
			<input name="ccname" type="text" class="form-control" /><BR/>
			</fieldset>
			<fieldset class="form-group">
			<label>Category Description  </label>
			<input name="ccdescript" type="text" class="form-control" /><BR/>
			 </fieldset>
			 <input name="add"
				type="submit" class ="btn btn-success" value="Submit"/>
				<a class="btn btn-danger"
		href="/catalog.do">Cancel</a>
		</form>


	<%@include file ="../common/footer.jspf"
%>