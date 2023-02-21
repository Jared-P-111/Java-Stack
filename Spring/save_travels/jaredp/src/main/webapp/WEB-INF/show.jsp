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
    <title>${expense.userExpense}</title>
  </head>
  <body>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-4" style="width: 500px">
        <h1>${expense.userExpense}</h1>
        <table class="table table-hover">
          <thead>
            <tr>
              <th scope="col">Expense Name</th>
              <th scope="col">Vendor Name</th>
              <th scope="col">Cost</th>
              <th scope="col">Description</th>
            </tr>
          </thead>
          <tbody>
            <tr class="table-active">
              <td>${expense.userExpense}</td>
              <td>${expense.vendor}</td>
              <td>${expense.cost}</td>
              <td>${expense.description}</td>
            </tr>
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
