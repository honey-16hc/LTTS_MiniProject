<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Repair Services</title>
		<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
		<link href="<%=request.getContextPath()%>/css/animate.css" rel="stylesheet">
		<link href="<%=request.getContextPath()%>/css/font-awesome.min.css" rel="stylesheet">
		<link href="<%=request.getContextPath()%>/css/font.css" rel="stylesheet">
		<link href="<%=request.getContextPath()%>/css/prettyPhoto.css" rel="stylesheet">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/datepicker.css">
		<link href="<%=request.getContextPath()%>/css/main_home.css" rel="stylesheet">
		<link href="<%=request.getContextPath()%>/css/responsivehome.css" rel="stylesheet">
		<link href="http://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet" type="text/css">

		<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/favicon.png">
		<style type="text/css">
			.dropbtn {
				color: #fff;
				font-size: 14px;
				height: 100%;
				text-transform: uppercase;
				font-family: 'allerregular';
				padding: 10px 17px;
				text-decoration: none;
			}

			.dropdown {
				display: inline-block;
				border: none;
				cursor: pointer;
				text-decoration: none;
			}

			.dropdown-content {
				display: none;
				position: absolute;
				background-color: gray;
				min-width: 160px;
				box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
				z-index: 1;
			}

			.dropdown-content a {


				text-decoration: none;
				display: block;
				padding: 10px 17px;
			}

			.dropdown-content a:hover {
				background-color: gray;
				color: #d9232d;
			}

			.dropdown:hover .dropdown-content {
				background-color: black;
				color: white;
				display: block;
			}

			.dropdown:hover .dropbtn {
				background-color: #d9232d;
				color: white;
				display-inline: block;
				text-decoration: none;
			}

			#myBtn {
				display: none;
				position: fixed;

				background-image: url(<%=request.getContextPath()%>/images/orah.png);
				bottom: 20px;
				right: 30px;
				z-index: 99;
				background: rgb(0, 0, 0);
				background: rgba(0, 0, 0, 0.7);
				border: none;
				outline: none;
border-radius: 35px;
                -webkit-border-radius:35px;
				cursor: pointer;
				padding: 15px;
			}
			 #myBtn span{
                color: #fff;
                margin: 0;
                position: relative;
                left: 0px;
                top:0px;
                font-size:19px;
                -webkit-transition: all 0.3s ease;
-moz-transition: all 0.3s ease;
-ms-transition: all 0.3s ease;
-o-transition: all 0.3s ease;
            }
            #myBtn:hover {
                background: rgba(0, 0, 0, 0.9);
            }
            #myBtn:hover span{
                color:#fff;
                top:-5px;
            }

			
		</style>


			<!--/#scripts-->
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.prettyPhoto.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.parallax.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.isotope.min.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.easypiechart.min.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.appear.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.inview.min.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/wow.min.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.countTo.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/smooth-scroll.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/canvas.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/preloader.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/main.js"></script>
			<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
			
		<script>
				// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("myBtn").style.display = "block";
    } else {
        document.getElementById("myBtn").style.display = "none";
    }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}

			</script>
	</head>

	<body>

		<header id="navigation">

			<div class="top-bar pull-right" style="width: 1350px; height:115px;">
				<h1 style="margin-top:0px; margin-left:70px; color:red;">Home Repair Services</h1>
				<span style=" margin-top:50px; margin-left:1000px;"> <i><a href="registration"> Sign up </a> </i></span>
				<span> <i><a href="login"> Log In </a> </i></span>
			</div>



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
						<ul class="nav navbar-nav topnav" style="width: 800px;">
							<li class="scroll active"><a href="home">Home</a></li>
							<div class="dropdown">
								<li class="scroll"><button type="button" class="dropbtn btn btn-link">Services</button></li>
								<div class="dropdown-content">
									<a href="/home/electronic">Electronic</a>
									<a href="/home/electric">Electric</a>
									<a href="/home/plumbing">Plumbing</a>
									<a href="/home/carpenter">Carpenter</a>

								</div>
							</div>
								<div class="dropdown">
								<li class="scroll"><a href="/home/technicians">Technicians</a></li>
							</div>
							<div class="dropdown">
								<li class="scroll"><a href="#contact-div">Contact</a></li>
							</div>

							<div class="dropdown">
								<li class="scroll"><a href="#about-us">About us</a></li>
							</div>
						</ul>
					</nav>
				</div>
			</div>
		</header>












		<div id="carousel-wrapper">
			<div id="home-carousel" class="carousel slide" data-ride="carousel">
				<div class="container">
					<div class="carousel-arrows">
						<a class="home-carousel-left" href="#home-carousel" data-slide="prev"><i class="fa fa-angle-left"></i></a>
						<a class="home-carousel-right" href="#home-carousel" data-slide="next"><i class="fa fa-angle-right"></i></a>
					</div>
				</div>
				<div class="carousel-inner" style="height:600px;">
					<div class="item active" style="background-image: url(<%=request.getContextPath()%>/images/bg.jpg)">
						<div class="carousel-caption container" style="margin-top:150px;">
							<h1 class="animated fadeInUpBig">We take pride in sending</h1>
							<h2 class="animated zoomIn">Verified Servicemen</h2>
							<p class="animated fadeInDownBig">Home Repair Services</p>
						</div>
					</div>

				</div>


<div class="service-image-box" style="background-color: white;">

					<div class="services">
						<h3 data-wow-delay="300ms" data-wow-duration="700ms" class="wow fadeInDown animated" style="visibility: visible; animation-duration: 700ms; text-transform: uppercase; letter-spacing: 5px; font-size: 20px; animation-delay: 300ms; animation-name: fadeInDown;">Our Services</h3>
						<hr class="title-border">
						<p data-wow-delay="300ms" data-wow-duration="700ms" class="wow fadeInUp animated" style="visibility: visible; color:black; animation-duration: 700ms; animation-delay: 300ms; animation-name: fadeInUp;">Delve deeper into our services cloud here</p>
					</div>

					<div class="inner-image-block">

						<div class="service-img">
							<a href="/home/plumbing"><img alt="" src="<%=request.getContextPath()%>/images/plum.jpg" class="img-responsive"></a>

							<div class="service-img-name" style="color: black;"><span>Plumber</span></div>
						</div>
						<div class="service-img" style="height:180px; width: 275px; margin-top: 0px; margin-bottom: 30px;">
							<a href="/home/electric"><img alt="" src="<%=request.getContextPath()%>/images/elec (2).jpg" class="img-responsive"></a>

							<div class="service-img-name" style="color: black;"><span>Electrician</span></div>
						</div>
						<div class="service-img single-blog">
							<a href="/home/carpenter"><img alt="" src="<%=request.getContextPath()%>/images/carpen.jpg" class="img-responsive"></a>

							<div class="service-img-name" style="color: black;"><span>Carpenter</span></div>
						</div>
						<div class="service-img single-blog">
							<a href="/home/electronic"><img alt="" src="<%=request.getContextPath()%>/images/ac.jpg" class="img-responsive"></a>

							<div class="service-img-name" style="color: blaack;"><span>A/C &amp; Refrigerator</span></div>
						</div>
					</div>

				</div>



				<div class="container text-center padding-top" style="color: white;">
					<div class="row section-title">
						<div class="col-sm-6 col-sm-offset-3">
							<h3 class="wow fadeInDown animated" data-wow-duration="700ms" data-wow-delay="300ms" style="visibility: visible;  -webkit-animation-duration: 700ms; -webkit-animation-delay: 300ms;">How We Work</h3>
							<hr class="title-border">
							<p class="wow fadeInUp animated" data-wow-duration="700ms" data-wow-delay="300ms" style="visibility: visible; color:white; -webkit-animation-duration: 700ms; -webkit-animation-delay: 300ms;">You can book a call for AC Servicing or any other home repair service requirement right from your home. It's quite
								easy and here's how it works</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-3 col-sm-6 wow zoomIn animated" data-wow-duration="700ms" data-wow-delay="300ms" style="visibility: visible; color:white; -webkit-animation-duration: 700ms; -webkit-animation-delay: 300ms;">
							<div class="service-icon">
								<i class=""><img src="<%=request.getContextPath()%>/images/ora1.png" width="60" height="60"  alt=""/></i>
							</div>
							<div class="service-text">
								<h4>Say you need a Serviceman for your home. You book a call on our website or customer care number</h4>
							</div>
						</div>
						<div class="col-md-3 col-sm-6 wow zoomIn animated" data-wow-duration="700ms" data-wow-delay="400ms" style="visibility: visible; color:white; -webkit-animation-duration: 700ms; -webkit-animation-delay: 400ms;">
							<div class="service-icon">
								<i class=""><img src="<%=request.getContextPath()%>/images/ora6.png" width="60" height="60"  alt=""/></i>
							</div>
							<div class="service-text">
								<h4>We have a list of verified Servicemen. These are trained, verified and trustworthy guys</h4>
							</div>
						</div>
						<div class="col-md-3 col-sm-6 wow zoomIn animated" data-wow-duration="700ms" data-wow-delay="500ms" style="visibility: visible; color:white; -webkit-animation-duration: 700ms; -webkit-animation-delay: 500ms;">
							<div class="service-icon">
								<i class=""><img src="<%=request.getContextPath()%>/images/ora3.png" width="60" height="60"  alt=""/></i>
							</div>
							<div class="service-text">
								<h4>The best situated Serviceman is assigned for you to address your requirement & meet the 2 hours TAT</h4>
							</div>
						</div>
						<div class="col-md-3 col-sm-6 wow zoomIn animated" data-wow-duration="700ms" data-wow-delay="600ms" style="visibility: visible; color:white; -webkit-animation-duration: 700ms; -webkit-animation-delay: 600ms;">
							<div class="service-icon">
								<i class=""><img src="<%=request.getContextPath()%>/images/oraha.png" width="60" height="60"  alt=""/></i>
							</div>
							<div class="service-text">
								<h4>ORA resolves all your home repair issues the call is closed after your complete satisfaction</h4>
							</div>
						</div>
					</div>
				</div>

				
				<div id="about-us" class="service-image-box" style="height:700px; margin-top: 0px;">
					<div class="services">
						<h3 data-wow-delay="300ms" data-wow-duration="700ms" class="wow fadeInDown animated" style="visibility: visible; animation-duration: 700ms; text-transform: uppercase; letter-spacing: 5px; font-size: 20px; animation-delay: 300ms; animation-name: fadeInDown;">About Us</h3>
						<hr class="title-border">
						<p data-wow-delay="300ms" data-wow-duration="700ms" class="wow fadeInUp animated" style="visibility: visible; color:black; animation-duration: 700ms; animation-delay: 300ms; animation-name: fadeInUp;">Delve deeper into our services cloud here</p>
					</div>
					<div class="row">
						<div class="col-sm-3">
						</div>
						<div class="col-sm-6" style="background-image: url(<%=request.getContextPath()%>/images/idb.jpg); background-repeat: no-repeat; width:800px; height:500px;">
							<div class="box">
								<p>Modern</p>
							</div>
							<div class="box1">
								<p>Quality</p>
							</div>
							<div class="box2">
								<p>Reliable</p>
							</div>
						</div>
						<div class="col-sm-3">
						</div>
					</div>
					<div class="vision">
						<div class="row" style="height:100px; margin-left:100px;">

							<div class="col-sm-6" style="margin-left: 10px; margin-top: 0px; border: 1px solid black; box-shadow: 2px 2px gray; width:400px; height:200px;">
								<p data-wow-delay="300ms" data-wow-duration="700ms" class="wow fadeInUp animated" style="visibility: visible; margin-top:40px; font-size:20px; text-transform: uppercase; color: white; animation-duration: 700ms; animation-delay: 300ms; animation-name: fadeInUp;">Our Vision</p>
								<h4 style="color: red; margin-top:30px; font-size:20px; letter-spacing:2px;">To resolves all your home repair issues and call will be closed only after customer satisfaction</h4>
							</div>
							<div class="col-sm-6" style="margin-left: 405px; margin-bottom:100px; border: 1px solid black; box-shadow: 2px 2px gray; width:400px; height:200px;">
								<p data-wow-delay="300ms" data-wow-duration="700ms" class="wow fadeInUp animated" style="visibility: visible; margin-top:40px; font-size:20px; text-transform: uppercase; color: white; animation-duration: 700ms; animation-delay: 300ms; animation-name: fadeInUp;">Our Mission</p>
								<h4 style="color: red; margin-top:30px; font-size:20px; letter-spacing:2px;">To resolves all your home repair issues and call will be closed only after customer satisfaction</h4>
							</div>

						</div>
					</div>
				</div>
				<div id="contact-div" class="contact" style="padding: 50px 0 0; margin-top:0px; width: 100%; clear: both; text-align: center; overflow: none; display: inline-block; position: relative; height:700px; color:red; background-color: white;">
					<h3 data-wow-delay="300ms" data-wow-duration="700ms" class="wow fadeInDown animated" style="visibility: visible; animation-duration: 700ms; text-transform: uppercase; letter-spacing: 5px; font-size: 20px; animation-delay: 300ms; animation-name: fadeInDown;">Contact Us</h3>
					<hr class="title-border">
					<div class="section" style="float: left; margin-left:50px; padding: 0 0 40px; width: 440px;">
						<div class="contact-us" style="color:black;">
							<h2>Get in touch with us!</h2>
							<form action="/contact" method="post">
								<div class="form-group">
									<span>Name</span>
									<input type="text" name="name" class="form-control">
								</div>

								<div class="form-group">
									<span>Email</span>
									<input type="email" name="email" class="form-control">
								</div>
								<div class="form-group">
									<span>Subject</span>
									<input type="text" name="subject" class="form-control">
								</div>
								<div class="form-group">
									<span>Comment</span>
									<textarea name="comment" class="form-control"></textarea>
								</div>
								<button type="submit" value="" class="btn">Submit</button>
							</form>
						</div>
					</div>
					<div class="sidebar" style="float:right; color:black; border:0; width:500px; height:400px; margn-right:400px;">
						<div class="img1" style="width:200px; height:200px; margin-left:100px;">
							<a href="/home"><img src="<%=request.getContextPath()%>/images/orah.png" alt=""></a>
						</div>
						<div class="content" style="margin-top:60px;">
							<h4>Contact Information</h4>
							<ul>
								<li>
									<b>Address:</b>
									<span>Sector 62, Noida</span>
								</li>
								<li>
									<b>Phone:</b>
									<span>+91 9793869182</span>
								</li>
								<li>
									<b>Email:</b>
									<span>honeychaudhary16.hc@gmail.com</span>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<span style="margin-left:300px;"> <i><a href="/home/admin"> Admin Sign in </a> </i></span>
<span style="margin-left:200px;"> <i><a href="/home/vendorsignup"> Vendor Registration </a> </i></span>
<span style="margin-left:200px;"> <i><a href="/home/techniciansignin"> Vendor Log In </a> </i></span>
			</div>
			<button onclick="topFunction()" id="myBtn" title="Go to top"><span class="glyphicon glyphicon-chevron-up"></span></button>

				
		
			<footer id="footer" style="color:white; margin-top:10px;height:100px;">
				<div>
					<span>&copy; 2021  </span> <span style="padding:10px;"> Home Repair Services </span> <span> All rights reserved. </span>

				</div>
			</footer>





	</body>

	</html>
	

	