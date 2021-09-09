<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booked</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css" />

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/mystyle.css" />
<link rel="shortcut icon" href="../favicon.ico"> 
<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.1/themes/base/jquery-ui.css" />                                                                                                            
  <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
  <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
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
                        <li class="scroll active a1"><a href="/home" style="color:red;">Home</a></li>
                        </ul>
                         </nav>
      </div>
      </div>
      
      
      <h1 style="color: white;"> Thank you ${user}, you have successfully booked the service. </h1>

      <div class="pre" style="color:white; border-color: white;">
			<div class="container-fluid top_bar">
				<div class="container">
					<div class="row">
						<div class="col-sm-2"></div>
						<div class="col-sm-10" style="color:white; margin-left:90px;">The following is the details of technician:</div>
					</div>
				</div>
			</div>

			<div class="container1">
Technician Name: <input type="hidden"  name="techName" value ="${tech.getUsername()}" >${tech.getUsername()}
<br>
Contact:   <input type="hidden"  name="techMobile" value ="${tech.getMobile()}" >${tech.getMobile()}
<br>
Address:  <input type="hidden"  name="techAddress" value ="${tech.getAddress()}" >${tech.getAddress()}
<br>
Photograph: <img src="data:image/jpeg;base64,${tech.getPic()}" class="img-responsive" width="200" height="100"/> 
<br>
<!--<form action="/sendemail" method="post">
<button type="submit" style="color:black; margin-left:300px;">Send email</button>
 </form>  -->
</div>
</div>
</body>
</html>