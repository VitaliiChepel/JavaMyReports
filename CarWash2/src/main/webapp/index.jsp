<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Orders</title>
<style type="text/css">
body {
	float: left;
	background: rgba(102, 181, 255, 0.5);
	width: 99%;
	height: 100%;
}

#footer {
	height: 30%;
	width: 99%;
	text-align: center;
	align ="center";
}

#footer2 {
	height: calc(5% -3px);
	width: 99%;
	text-align: center;
	align
	="center";
}

.button1 {
	font-size: 30px;
	background-color: white;
	color: green;
	border: 2px solid blue;
}

.button2 {

	font-size: 50px;
	background-color: white;
	color: blue;
	border: 2px solid red;
}

h1{
color: #9400D3;
	font-size: 55px;

}
p{
    color: red;
	font-size: 100px;

}
.up{
margin-top: 100px;
}
</style>
</head>

<body>


	<div id="footer">
		
<form action="./GettingOrdersWithDiscount">
				<input type="submit" value="Show" class="button2">
			</form>

		<h1 class="up">
			Show All Orders :
			<form action="/ShowingAllOrders">
				<input type="submit" value="Show" class="button2">
			</form>
		</h1>

	</div>

</body>
</html>
