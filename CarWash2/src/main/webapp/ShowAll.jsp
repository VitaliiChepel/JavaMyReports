<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All</title>
<style type="text/css">
body {
	float: left;
	background: rgba(102, 181, 255, 0.5);
	width: 99%;
	height: 97%;
}

table, th, td {
	border: 3px solid #ADFF2F;
	background-color: black;
	color: white;
}

.b {
	color: #9400D3;
	font-size: 25px;
}

#footer {
	height: 90%;
	width: 100%;
	text-align: center;
	align
	="center";
}

.t {
	margin-left: auto;
	margin-right: auto;
	width: 80%;
}
.button1 {

	font-size: 40px;
	background-color: #00FF00;
	color: blue;
	border: 5px solid #9400D3;
	text-align: center;
	align="center";
}

.button2 {
	font-size: 30px;
	background-color: #00FFFF;
	color: green;
	border: 5px solid blue;
}
</style>
</head>
<body>

	<div id="footer">
		<B class="b"> Перечень заказов</B>
		<table class="t">
			<tr>
				<th>Id</th>
				<th>Date</th>
				<th>Total price</th>
				<th>Reg.number</th>
			</tr>

			<c:forEach var="order" items="${All}">
				<tr>
					<td><c:out value="${order.id_ord}" /></td>
					<td><c:out value="${order.date_info}" /></td>
					<td><c:out value="${order.total_price}" /></td>
					<td><c:out value="${order.reg_number}" /></td>					
				</tr>
			</c:forEach>
		</table>
	</div>

	<div id="footer">

	

		<form action="/CarWash/" method="get">
			<input type="submit" value="Exit" class="button1">
		</form>
	</div>

</body>
</html>







	
