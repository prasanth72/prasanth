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
      <li><a href="ret">View All</a></li>
         <li><a href="cont">Contact us</a></li>
          <li><a href="logout">Logout</a></li>
      </ul>
  </div>
</nav>
<!--<c:url var="storeproduct" value="saveproduct"/>-->
  <form:form id="st1" modelAttribute="product" method="post" action="update" enctype="multipart/form-data">
    <form:hidden style="visibility:hidden" path="productId" value="${product.productId}" />
      <tr><td><form:label path="productName">product Name :</form:label></td>
               <td><form:input path="productName" value="${product.productName}"/></td>
           </tr>
               <tr><td><form:label path="productPrice">product Price :</form:label></td>
               <td><form:input path="productPrice" value="${product.productPrice}"/></td>
           </tr>
           <tr><td><form:label path="productDescription">Description :</form:label></td>
               <td><form:input path="productDescription" value="${product.productDescription}"/></td>
           </tr>
           
           <tr><td><form:label path="productStyle">Style :</form:label></td>
               <td><form:input path="productStyle" value="${product.productStyle}"/></td>
           </tr>
               <tr><td><form:label path="warranty">Warranty :</form:label></td>
               <td><form:input path="warranty" value="${product.warranty}"/></td>
           </tr>
           <tr><td><form:label path="primaryMaterial">Primary Material :</form:label></td>
               <td><form:input path="primaryMaterial" value="${product.PrimaryMaterial}"/></td>
           </tr>
           </tr>
               <tr><td><form:label path="capacity">Capacity :</form:label></td>
               <td><form:input path="capacity" value="${product.capacity}"/></td>
           </tr>           
           <tr><td><form:label path="img">product Image :</form:label></td>
               <td><form:input path="img" type="file" />
               <font color="red"><form:errors path="img"></form:errors></font></td><tr>
           
           
               <tr><td></td>
               <td><input type="submit" value="submit"/></td>
           </tr>
           
                      
  </form:form>   
</body>
</html>
