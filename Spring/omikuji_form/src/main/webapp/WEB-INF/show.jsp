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
    <link rel="stylesheet" href="/webjars/bootswatch/5.2.3/dist/vapor/bootstrap.min.css" />
    <title>Show</title>
  </head>
  <body>
    <div class="container mt-5 d-flex justify-content-center">
      <h1>Heres Your Omikuji</h1>
    </div>
    <div class="container">
      <div class="alert alert-dismissible alert-info">
        <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
        <h4 class="alert-heading">Warning!</h4>
        <p class="mb-0">
          In <c:out value="${numPick}"></c:out> years, you will live in
          <c:out value="${nameOfCity}"></c:out> with <c:out value="${nameOfPerson}"></c:out> as your
          roommate, selling <c:out value="${endeavor}"></c:out> for a living
        </p>
      </div>
    </div>
  </body>
</html>
