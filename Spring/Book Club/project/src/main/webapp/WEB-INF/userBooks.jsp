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
    <title>Welcome ${firstName}</title>
  </head>
  <body>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-4" style="width: 500px">
        <h1>Welcome, ${firstName}</h1>
        <table class="table table-hover">
          <thead>
            <tr>
              <th scope="col">ID</th>
              <th scope="col">Title</th>
              <th scope="col">Author Name</th>
              <th scope="col">Posted By</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="book" items="${books}">
              <tr>
                <td>${book.id}</td>
                <td><a href="/books/${book.id}">${book.title}</a></td>
                <td>${book.author}</td>
                <td>${book.user.userName}</td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
        <form action="/books" method="post">
          <input type="hidden" name="_method" value="delete" />
          <input type="submit" value="Home" />
        </form>
      </div>
    </div>
  </body>
</html>
