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
    <link href="<c:url value='/resources/css/neuromorphic.css' />" rel="stylesheet" />
    <!-- <link href="<c:url value='/resources/css/styles.css' />" rel='stylesheet'> -->
    <title>Location Ninjas</title>
  </head>
  <body>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-4" style="width: 500px">
        <h1>${dojo.name} Ninjas</h1>
        <table class="table table-hover">
          <thead>
            <tr>
              <th scope="col">First Name</th>
              <th scope="col">Last Name</th>
              <th scope="col">Age</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="ninja" items="${dojo.ninjas}">
              <tr>
                <td>${ninja.first}</td>
                <td>${ninja.last}</td>
                <td>${ninja.age}</td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
        <form action="/" method="post">
          <input type="hidden" name="_method" value="delete" />
          <input type="submit" value="Home" />
        </form>
      </div>
    </div>
  </body>
</html>
