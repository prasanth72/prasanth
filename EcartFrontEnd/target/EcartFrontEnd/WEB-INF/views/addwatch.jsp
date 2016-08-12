<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"></c:url>' />
  <script src='<c:url value="/resources/js/jquery.min.js"></c:url>'></script>
  <script src='<c:url value="/resources/js/bootstrap.min.js"></c:url>'></script>
  <script src='<c:url value="/resources/js/angular.min.js"></c:url>'></script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="h1">Home</a></li>
      <li><a href="ret">addwatch</a></li>
         <li><a href="cont">Contact us</a></li>
     </ul>
  </div>
</nav>
    <div class="container" ng-app="imgApp" ng-controller="imgCtrl">
    <c:url var="addwa" value="addwa"></c:url>
   <form:form commandName="product" method="post" action="storepro" enctype="multipart/form-data">
       <table class="table table-bordered" >
           
           <tr><td><form:label path="id"> Id :</form:label></td>
               <td><form:input path="id"/>
               <font color="red"><form:errors path="id"></form:errors></font></td>
           </tr>
           <tr><td><form:label path="name">Name :</form:label></td>
               <td><form:input path="name"/>
               <font color="red"><form:errors path="name"></form:errors></font></td>
           </tr>
           <tr><td><form:label path="description">Description :</form:label></td>
               <td><form:input path="description"/>
               <font color="red"><form:errors path="description"></form:errors></font></td>
           </tr>           
           <tr><td><form:label path="price">Price :</form:label></td>
               <td><form:input path="price"/>
               <font color="red"><form:errors path="price"></form:errors></font></td>
           </tr>
          
                         <td><input type="submit" value="submit" class="btn"/></td>
           </tr>
           
       </table>
   </form:form> 
   
</body>
</html>