<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>Bus Reservation Portal - Balaji Venkatesan - Altimetrik </title>
</head>
<body style="font-family: Arial, Helvetica, sans-serif">
	<div class="container" style="background: none;">
		<h1>Bus Reservation Portal</h1>
		<h4>Coding Assessment - Balaji Venkatesan - Altimetrik</h4>
	</div>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">Search</div>
			<div class="panel-body">
				<form:form class="form-inline" method="get" action="search"  modelAttribute="search">
					<div class="form-group">
						<label for=">Source City">Source City :</label> 
						<form:select class="form-control" path="departure" >
   						 	<form:options items ="${locations}"/>
  						</form:select>
					</div>
					<div class="form-group">
						<label for="Destination City">Destination City :</label>
						<form:select class="form-control" path="arrival">
   						 	<form:options items ="${locations}"/>
  						</form:select>
					</div>
					<div class="form-group">
						<label for="Destination City">Travel Date : </label> <form:input
							type="text" class="form-control" path="traveldate"></form:input>
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form:form>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">Search Result</div>
			<div class="panel-body">
			<c:if test="${empty  busList}">
 				 ${info}
			</c:if>
			<c:if test="${not empty  busList}">
				<table
					class="table table-striped table-hover table-condensed table-bordered">
					<tr>
						<th>Bus Number </th>
						<th>Bus Details</th>
						<th>Book Now</th>
					</tr>
					<c:forEach var="bus" items="${busList}">
						<tr>
							<td>${bus.busNumber}</td>
							<td>Company : ${bus.busCompany}<br/>
							Departure Time : ${bus.departureTime}<br/>
							Arrival Time : ${bus.arrivalTime}<br/>
							Available Seats : ${bus.remainingSeats}<br/>
							Price : ${bus.fareMaster.fareAmount}</td>
							<td class="align-middle"><button type="button" class="btn btn-success">Book Seats</button></td>
						</tr>
					</c:forEach>
				</table>
				</c:if>
			</div>
		</div>
	</div>



	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>