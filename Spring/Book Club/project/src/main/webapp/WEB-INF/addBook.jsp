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
    <link href="<c:url value='/resources/css/slate' />" rel="stylesheet" />
    <!-- <link href="<c:url value='/resources/css/styles.css' />" rel='stylesheet'> -->
    <title>Add book</title>
  </head>
  <body>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-3" style="width: 500px">
        <h1 class="container mt-3">Add New Book</h1>
        <form:form action="/books/new/book" method="post" modelAttribute="book">
          <form:label path="title">Book Title</form:label>
          <form:input path="title"></form:input>
          <form:label path="author">Author</form:label>
          <form:input path="author"></form:input>
          <form:label path="thoughts">My thoughts</form:label>
          <form:input path="thoughts"></form:input>
          <div>
            <form:hidden path="user" value="${userId}"/>
            <input type="submit" value="add book" class="btn btn-info mt-5">
          </div>
        </form:form>
      </div>
    </div>
  </body>
</html>
