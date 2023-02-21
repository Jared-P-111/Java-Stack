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
    <title>Edit Expense</title>
  </head>
  <body>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-3" style="width: 500px">
        <h1 class="container mt-3">Enter Expense</h1>
        <form:form action="/expenses/update/${expense.id}" method="post" modelAttribute="expense">
          <input type="hidden" name="_method" value="put">
          <form:label path="userExpense" class="mt-2">Expense Name:</form:label>
            <div class="form-group mt-3">  
                <form:errors path="userExpense"></form:errors>
                <form:input path="userExpense" class="w-100"></form:input>
            </div>
            <form:label path="vendor" class="mt-2">Vendor Name:</form:label>
            <div class="form-group mt-3">            
                <form:errors path="vendor"></form:errors>
                <form:input path="vendor" class="w-100"></form:input>
            </div>
            <form:label path="cost" class="mt-2">Amount:</form:label>
            <div class="form-group mt-3">             
                <form:errors path="cost"></form:errors>
                <form:input path="cost" class="w-100"></form:input>
            </div>
            <form:label path="description" class="mt-2">Description:</form:label>
            <div class="form-group mt-3">
              <form:errors path="description"></form:errors>
              <form:textarea path="description" class="w-100"></form:textarea>
            </div>
            <input type="submit" value="edit expense" class="btn btn-info mt-5">
        </form:form>
      </div>
    </div>
  </body>
</html>
