<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" %>
<%@ page import="example.com.sample.Uranai" %>
<%
Uranai uranai = new Uranai();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ占い</title>
</head>
<body>
<p><%= uranai.getDate() %>の運勢は「<%= uranai.getLuck() %>」です</p>
</body>
</html>