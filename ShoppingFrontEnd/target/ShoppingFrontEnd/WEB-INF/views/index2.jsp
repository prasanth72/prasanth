<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
<head>
  <title>ECart</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 60%;
      margin: auto;
  }
  </style>
</head>
<body background="/resources/images/background.jpg"/ >
	<h1>
		<center>ECart</center>
	</h1>
	
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">ECart</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="hai">Home</a></li>
      <li><a href="addproduct">add Products</a></li>
        <li><a href="retrieve">retrieve</a></li>
      
      <li><a href="#"></a></li> 
    </ul>
    <ul class="nav navbar-nav navbar-right">
    <li><a href="Login"><span class="glyphicon glyphicon-log-out"></span>logout</a></li>
    
       </ul>
  </div>
</nav>
Hello ..<%=session.getAttribute("aaa") %>
 <div class="container">
  
    <div class="center-block">  
    
  <br>
  6<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
    <li data-target="#myCarousel" data-slide-to="4"></li>
        <li data-target="#myCarousel" data-slide-to="5"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
         <img src="<c:url value="/resources/images/1.jpg" />" alt="JACK PIERRE" >
      </div>

    <div class="item">
      <img src="<c:url value="/resources/images/2.jpg" />" alt="OMEGA">
    </div>

    <div class="item">
      <img src="<c:url value="/resources/images/3.jpg" />" alt="HUBLOT">
    </div>

    <div class="item">
      <img src="<c:url value="/resources/images/4.jpg" />" alt="CSF">
    </div>
    
    <div class="item">
      <img src="<c:url value="/resources/images/5.jpg" />" alt="VRATISLAVIA">
    </div>
  </div>
      
          <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div></div></div>
 

<div class="container">
            
  <div class="row">
    <div class="col-sm-4">
      <a href="enter">
          
       
  </div>
</div>
</body>
</html>