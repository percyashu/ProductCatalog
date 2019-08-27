<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>ProductCatalog</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	</head>
	<nav class="navbar navbar-default">
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/signIn.do">SignIn</a></li>
		</ul>

	</nav>
<h1>SignUp</h1>
	
<form action="/signUp.do" method="POST">

	<fieldset class="form-group">
		<label>Name</label>
		<input name="name" type="text" class="form-control" /><BR/>
	</fieldset>
	<fieldset class="form-group">
		<label>Username</label>
		<input name="username" type="text" class="form-control"/><BR/>
	</fieldset>
	<fieldset class="form-group">
		<label>Password</label>
		<input name="password" type="password" class="form-control"/><BR/>
	</fieldset>
	<fieldset class="form-group">
		<label>Comfirm password</label>
		 <input name="cpassword" type="password" class="form-control" /><BR/>
	</fieldset>
<input type="Submit" class ="btn btn-success" value="Login" />
	
	

<p><font color="red">${errorMessage}</font></p>
</form>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>
	