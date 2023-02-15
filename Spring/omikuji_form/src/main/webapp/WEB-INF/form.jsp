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
    <title>Document</title>
    <link rel="stylesheet" href="/webjars/bootswatch/5.2.3/dist/slate/bootstrap.min.css" />
  </head>
  <body>
    <div class="container mt-5">
      <form action="/omikuji/new" method="post">
        <fieldset>
          <h1>Send an Omikuji</h1>
          <div class="form-group row"></div>
          <div class="form-group">
            <label for="numPick" class="form-label mt-4">Pick number 1 - 25</label>
            <select class="form-select" id="numPick" name="numPick">
              <c:forEach var="i" begin="1" end="25">
                <option><c:out value="${i}" /></option>
              </c:forEach>
            </select>
          </div>
          <div class="form-group">
            <label for="nameOfCity" class="form-label mt-4">Name of city</label>
            <input
              type="text"
              class="form-control"
              id="nameOfCity"
              aria-describedby="cityHelp"
              placeholder="City"
              name="nameOfCity"
            />
          </div>
          <div class="form-group">
            <label for="nameOfPerson" class="form-label mt-4">Name of Person</label>
            <input
              type="text"
              class="form-control"
              id="nameOfPerson"
              aria-describedby="cityHelp"
              placeholder="Person"
              name="nameOfPerson"
            />
          </div>
          <div class="form-group">
            <label for="endeavor" class="form-label mt-4">Enter professional endeavor</label>
            <input
              type="text"
              class="form-control"
              id="endeavor"
              aria-describedby="cityHelp"
              placeholder="Endeavor"
              name="endeavor"
            />
          </div>
          <div class="form-group">
            <label for="creatureType" class="form-label mt-4">Type of any living creature</label>
            <input
              type="text"
              class="form-control"
              id="creatureType"
              aria-describedby="cityHelp"
              placeholder="Creature"
              name="creatureType"
            />
          </div>
          <div class="form-group">
            <label for="userMessage" class="form-label mt-4">Say something nice to someone</label>
            <textarea
              class="form-control"
              id="userMessage"
              rows="2"
              placeholder="Your message here"
              name="userMessage"
            ></textarea>
          </div>
          <button type="submit" class="btn btn-primary mt-5">Submit</button>
        </fieldset>
      </form>
    </div>
  </body>
</html>
