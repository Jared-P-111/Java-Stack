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
    <title>Document</title>
    <link rel="stylesheet" href="/webjars/bootswatch/5.2.3/dist/slate/bootstrap.min.css" />
  </head>
  <body>
    <div class="container mt-5">
      <table class="table table-hover">
        <thead>
          <tr>
            <th scope="col">name</th>
            <th scope="col">price</th>
            <th scope="col">description</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="fruit" items="${fruits}">
            <tr class="table-active">
              <td>${fruit.name}</td>
              <td>${fruit.price}</td>
              <td>${fruit.description}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </body>
</html>
