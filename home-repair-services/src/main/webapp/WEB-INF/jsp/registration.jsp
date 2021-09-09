<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css" />

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/mystyle.css" />
<link rel="shortcut icon" href="../favicon.ico"> 
</head>
<body style="background-image: url(<%=request.getContextPath()%>/images/bg.jpg)">
<div class="navbar main-nav" role="banner">
            <div class="container">
                <div class="navbar-header">
  
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    
                </div>	
                <nav class="collapse navbar-collapse navbar-right" style="margin-right:400px; ">					
                    <ul class="nav navbar-nav topnav" style="width: 800px; font-color: white;">
                        <li class="scroll active a1"><a href="/home">Home</a></li>
                        </ul>
                         </nav>
      </div>
      </div>
<form action="signup" method="post">
<div class="pre">
			<div class="container-fluid top_bar">
				<div class="container">
					<div class="row">
						<div class="col-sm-2"></div>
						<div class="col-sm-10">Registration</div>
					</div>
				</div>
			</div>

			<div class="container1">
				<div class="form-group">
<input type="text" placeholder="UserName" name="name" required><br>
</div>
	<div class="form-group">
<input type="email" placeholder="Email" id="id2" name="email" required> <br>
</div>
	<div class="form-group">
<input type="password" placeholder="Password" name="password" required><br>
</div>
	<div class="form-group">
<input type="tel" placeholder="Contact" name="mobile" pattern="[6789][0-9]{9}" title="Enter valid phone number" required><br>
</div>
	<div class="form-group">
<textarea placeholder="Address" name="address" required></textarea><br>
</div>
	
					<button type="button" class="btn cancelbtn">Cancel</button>
					<button type="submit" class="btn submitbtn">Submit</button>
			</div>
			</div>
	</form>
</body>
</html>