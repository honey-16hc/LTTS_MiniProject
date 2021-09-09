<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
                                              <li class="scroll active a1" >  <button type="button" name="Back" onclick="history.back()" style="color:red;margin-top:15px;margin-left:15px;">Back</button></li>
                        
                        </ul>
                         </nav>
      </div>
      </div>
      
     <form action="/updateservices", method="post">
<div class="pre" style="color:white; border-color: gray;">
			<div class="container-fluid top_bar">
				<div class="container">
					<div class="row">
						<div class="col-sm-2"></div>
						<div class="col-sm-10" style="color:white;">Electric Service</div>
					</div>
				</div>
			</div>

			<div class="container1"> 
  Category: <select name="category" required  style="color:black;" >
<option value="Electronic"> Electronic</option>
<option value="Electric"> Electric</option>
<option value="Plumbing"> Plumbing</option>
<option value="Carpenter"> Carpenter</option>
</select>
<br><br>
Sub Category:
<select name="subCategory" required  style="color:black;" >
<c:forEach  items="${sub}" var="m">
<option value="${m.getSubCategory()}">${m.getSubCategory()}</option>
</c:forEach>
</select>
<br><br>
Updated Sub Category:
<input type="text"  name="newSubCategory" autocomplete="off" style="color:black;" required>
<br><br>
<button type="submit" style="color:black; margin-left:300px;">Proceed</button>
</div>
</div>
</form>
</body>
</html>