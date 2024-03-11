<%@ page import="exercicios.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercícios</title>
</head>
<body>
	<div>
        <h1>Exercício 3</h1>
        <%
			out.println( "<p>" + new Pessoa("Albert Einstein", 1879, 3, 14) );
        	out.println( "</p> <p>" + new Pessoa("Isaac Newton", 1643, 1, 04) );
        	out.println("</p>");
		%>
    </div>
    
    <div>
    	<h1>Exercício 4</h1>
    	<%! SegundoGrau calc = new SegundoGrau(1, 12, -13); %>
    	
    	<%= calc.calcDelta() %>
    	<%= calc.calcRaizes() %>
    	
    </div>
</body>
</html>