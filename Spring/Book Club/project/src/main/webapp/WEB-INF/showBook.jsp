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
    <link href="<c:url value='/resources/css/slate.css' />" rel="stylesheet" />
    <!-- <link href="<c:url value='/resources/css/styles.css' />" rel='stylesheet'> -->
    <title>Show book</title>
  </head>
  <body>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-4" style="width: 500px">
        <small>Title:</small>
        <h1>${book.title}</h1>
        <a href="/books"><button class="btn btn-info">Home</button></a>
      </div>
    </div>
  </body>
</html>
