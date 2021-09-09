<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Technicians</title>
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
                        <li class="scroll active a1"><a href="/home" style="color:red;">Home</a></li>
                        </ul>
                         </nav>
      </div>
      </div>
<div class="container-fluid top_bar">
				<div class="container">
					<div class="row">
						<div class="col-sm-2"></div>
						<div class="col-sm-10" style="color:white;">Our Verified Technicians</div>
					</div>
				</div>
			</div>
			
<div class="service-image-box" style="background-color: white; margin-top:50px;">
<c:forEach  items="${list}" var="h" >
<div class="col-lg-4" style="float:right;color:white;" > 
<img src="data:image/jpeg;base64,${h.getPic()}" class="img-responsive" width="200" height="100"/>
<br>
Name: ${h.getUsername()}
<br>
Address: ${h.getAddress()}
<br>
Field: ${h.getField()}
<br>
<br>

<br>
<br>
</div>
</c:forEach>
</div>
</body>
</html>