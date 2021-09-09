<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Technician</title>
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
                        <li class="scroll active a1" ><a href="/home" style="color:red;">Home</a></li>
                        </ul>
                         </nav>
      </div>
      </div>
    
							
							
	 <form action="/updatetechniciandetails", method="post">
<div class="pre" style="color:white; border-color: white;">
			<div class="container-fluid top_bar">
				<div class="container">
					<div class="row">
						<div class="col-sm-2"></div>
						<div class="col-sm-10" style="color:white; margin-left:120px;">Details</div>
					</div>
				</div>
			</div>

			<div class="container1">
<br>
<b>Name: </b> <input type="hidden"  name="name" value ="${user.getUsername()}"> ${user.getUsername()}
<br>
<b>Email:</b>  <input type="hidden"  name="email" value ="${user.getEmail()}">${user.getEmail()}
<br>
<b>Contact: </b>  <input type="hidden"  name="mobile" value ="${user.getMobile()}">${user.getMobile()}
<br>
<b>Address: </b>  <input type="hidden"  name="address" value ="${user.getAddress()}">${user.getAddress()}
<br>
<b>Field: </b>  <input type="hidden"  name="field" value ="${user.getField()}">${user.getField()}
<br>
 <b>Photograph: </b> <img src="data:image/jpeg;base64,${user.getPic()}" class="img-responsive" width="200" height="100"/> 
<br>
<input type="hidden"  name="userId" value ="${user.getId()}">

<button type="submit" style="color:black; margin-left:300px;">Update Details</button>

</div>
</div>
</form>
</body>
</html>