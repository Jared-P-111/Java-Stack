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
    <link href="<c:url value='/resources/css/neuromorphic.css' />" rel="stylesheet" />
    <!-- <link href="<c:url value='/resources/css/styles.css' />" rel='stylesheet'> -->
    <title>Document</title>
  </head>
  <body>
    <div class="container mt-3 d-flex justify-content-center">
      <div class="card p-3" style="width: 500px">
        <h1 class="container mt-3">Enter New Dojo</h1>
        <form:form action="/dojos" method="post" modelAttribute="dojo">
          <form:label path="name">Dojo Name</form:label>
          <form:input path="name"></form:input>
          <div>
            <input type="submit" value="create dojo" class="btn btn-info mt-5">
          </div>
        </form:form>
      </div>
    </div>
  </body>
</html>
