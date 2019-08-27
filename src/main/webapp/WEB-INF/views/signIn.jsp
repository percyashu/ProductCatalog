<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>ProductCatalog</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	</head>
	<nav class="navbar navbar-default">
	<ul class="nav navbar-nav">
			<li ><a href="/listProduct.do">Home</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
		
			<li><a href="/signUp.do">SignUp</a></li>
		</ul>

	</nav>
<div class="row">
        <div class="col-sm-6 col-sm-offset-3 form-box">
            <div class="form-top">
                <div class="form-top-left">
                    <h3>Login </h3>
                </div>
                <div class="form-top-right">
                    <i class="fa fa-key"></i>
                </div>
            </div>
            <div class="form-bottom">
                <form role="form" action="/signIn.do" method="post" class="login-form">
                    <div class="form-group">
                        <label class="sr-only" for="usernamee">Username</label>
                        <input type="text" name="username" placeholder="Username..." class="form-username form-control" id="form-username">
                    </div>
                    <div class="form-group">
                        <label class="sr-only" for="password">Password</label>
                        <input type="password" name="password" placeholder="Password..." class="form-password form-control" id="form-password">
                    </div>
                    <p><font color="red">${errorMessage}</font></p>
                    <button type="submit" class="btn btn-success">Sign in!</button>
                </form>
            </div>
        </div>
    </div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>
	