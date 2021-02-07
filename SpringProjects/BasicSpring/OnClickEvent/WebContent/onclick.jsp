<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<script>
function myFunction() {
  document.getElementById("demo").innerHTML = "You Clicked the image";
}
</script>

<h1>The onclick Event</h1>

<img src="C:\Users\Public\Pictures\Sample Pictures\Jellyfish.jpg" onclick="myFunction()" width=200 height=250/>
<!-- <button onclick="myFunction()">Click image</button> -->

<p id="demo">Click the image please</p>
</body>
</html>