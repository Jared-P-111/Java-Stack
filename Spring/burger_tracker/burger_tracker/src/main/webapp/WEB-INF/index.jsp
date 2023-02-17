<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- <link rel="stylesheet" href="/webjars/bootswatch/5.2.3/dist/vapor/bootstrap.min.css" /> -->
    <link href="<c:url value='/resources/css/vapor.css' />" rel='stylesheet'>
    <!-- <link href="<c:url value='/resources/css/styles.css' />" rel='stylesheet'> -->
    <title>Document</title>
  </head>
  <body style="height: 100vh">
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-4" style="width: 500px">
        <h1>Your burgers</h1>
          <table class="table table-hover">
            <thead>
              <tr>
                <th scope="col">Burger Name</th>
                <th scope="col">Restaurant Name</th>
                <th scope="col">Rating</th>
              </tr>
            </thead>
            <tbody>
              <c:forEach var="burger" items="${burgers}">
                <tr class="table-active">
                  <th scope="row">Active</th>
                  <td>${burger.burgerName}</td>
                  <td>${burger.restaurantName}</td>
                  <td>${burger.rating}</td>
                </tr>
              </c:forEach>
            </tbody>
          </table>   
      </div>
    </div>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-3" style="width: 500px">
        <h1 class="container mt-3">Enter your burger</h1>
        <form:form action="/burgers" method="post" modelAttribute="burger">
          <form:label path="burgerName" class="mt-2">name</form:label>
            <div class="form-group mt-3">  
                <form:errors path="burgerName"></form:errors>
                <form:input path="burgerName" class="w-100"></form:input>
            </div>
            <form:label path="restaurantName" class="mt-2">restaurantName</form:label>
            <div class="form-group mt-3">            
                <form:errors path="restaurantName"></form:errors>
                <form:input path="restaurantName" class="w-100"></form:input>
            </div>
            <form:label path="rating" class="mt-2">rating</form:label>
            <div class="form-group mt-3">             
                <form:errors path="rating"></form:errors>
                <form:input path="rating" class="w-100"></form:input>
            </div>
            <form:label path="notes" class="mt-2">notes</form:label>
            <div class="form-group mt-3">             
                <form:errors path="notes"></form:errors>
                <form:input path="notes" class="w-100"></form:input>
            </div>
            <input type="submit" value="create burger" class="btn btn-info mt-5">
        </form:form>
      </div>
    </div>
  </body>
</html>
