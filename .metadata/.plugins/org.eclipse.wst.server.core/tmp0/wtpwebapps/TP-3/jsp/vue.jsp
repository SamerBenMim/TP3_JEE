<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% int nbLig=Integer.parseInt(request.getParameter("nbLig"));
int nbCol=Integer.parseInt(request.getParameter("nbCol"));
%>
<table>
<%for(int i=0;i<nbLig;i++)
	{%>
	
  <tr>
  <%for(int j=0;j<nbCol;j++)
	{%>
    <th>Narwes</th>
    <%} %>
    </tr>
    <%} %>
</table>
</body>
