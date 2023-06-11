<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: linear-gradient(to left,#9C9C9C ,white);">
<center>
<div style="width: 500px; height: 300px; box-shadow: 1px 1px 1px 1px; position: relative; top: 100px; background-color: white">
<h3>Enter OTP Received</h3><br><br>
<h4>Login With OTP</h4>
<h6>Mobile Number:<input type="number" value="<%=request.getParameter("phno")%>"></h6>
<h6>OTP Received:<input type="number"></h6>
<button onclick="location.href='enroll.html'" style="width: 400px; background-color: green; border: 0px; height: 40px">SIGN In=></button>
</div>
</center>
</body>
</html>