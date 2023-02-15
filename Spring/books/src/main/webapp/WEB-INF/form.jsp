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
    <link rel="stylesheet" href="/webjars/bootswatch/5.2.3/dist/vapor/bootstrap.min.css" />
  </head>
  <body>
    <div class="container mt-5">
      <form>
        <fieldset>
          <div class="form-group">
            <label for="enterTitle" class="form-label mt-4">Enter Title</label>
            <input
              type="text"
              class="form-control"
              id="enterTitle"
              aria-describedby="titleEntry"
              placeholder="Enter title"
            />
          </div>
          <div class="form-group">
            <label for="description" class="form-label mt-4">Description</label>
            <textarea class="form-control" id="description" rows="3"></textarea>
          </div>
          <input
            type="number"
            class="form-control mt-3"
            id="enterPages"
            aria-describedby="titlePages"
            placeholder="Enter number of pages"
          />
          <button type="submit" class="btn btn-primary mt-3">Submit</button>
        </fieldset>
      </form>
    </div>
  </body>
</html>
