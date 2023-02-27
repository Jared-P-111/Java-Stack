<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="<c:url value='/resources/css/slate.css' />" rel="stylesheet" />
    <!-- <link href="<c:url value='/resources/css/styles.css' />" rel='stylesheet'> -->
    <title>Login & Registration</title>
  </head>
  <body>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-3" style="width: 500px">
        <h1 class="container mt-3">Register</h1>
            <form:form action="/register" method="post" modelAttribute="newUser">
              <div class="d-flex justify-content-between mt-3">
                <form:label path="userName">User Name: </form:label>
                <form:input path="userName"></form:input>
                <form:errors path="userName"></form:errors>
              </div>
              <div class="d-flex justify-content-between mt-3">
                <form:label path="email">Email: </form:label>
                <form:input path="email"></form:input>
                <form:errors path="email"></form:errors>
              </div>
              <div class="d-flex justify-content-between mt-3">
                <form:label path="password">Password: </form:label>
                <form:input path="password"></form:input>
                <form:errors path="password"></form:errors>
              </div>
              <div class="d-flex justify-content-between mt-3">
                <form:label path="confirm">Confirm: </form:label>
                <form:input path="confirm"></form:input>
                <form:errors path="confirm"></form:errors>
              </div>
              <div>
                <input type="submit" value="login" class="btn btn-info mt-5"> 
              </div>
            </form:form>
          </div>
        </div>
    </div>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-3" style="width: 500px">
        <h1 class="container mt-3">Login</h1>
        <form:form action="/login" method="post" modelAttribute="newLogin">
          <div class="d-flex justify-content-between mt-3">
            <form:label path="email">Email: </form:label>
            <form:input path="email"></form:input>
            <form:errors path="email"></form:errors>
          </div>
          <div class="d-flex justify-content-between mt-3">
            <form:label path="password">Password: </form:label>
            <form:input path="password"></form:input>
            <form:errors path="password"></form:errors>
          </div>
          <div>
            <input type="submit" value="login" class="btn btn-info mt-5"> 
          </div>
        </form:form>
      </div>
    </div>
  </body>
</html>
