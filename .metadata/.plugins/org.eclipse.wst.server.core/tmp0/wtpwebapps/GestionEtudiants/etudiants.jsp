<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="web.GestionEtudiant,web.Etudiant"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Etudiants</title>
</head>
<body>
<% for(int i=0;i<GestionEtudiant.getSize();i++)
	{
	%>
	<form method="get" action="SupprimerEtudiant">
	<div>
	<%=GestionEtudiant.etudiants.get(i).getCin() %>
	 <%=GestionEtudiant.etudiants.get(i).nom %>
	  <%=GestionEtudiant.etudiants.get(i).prenom %>
	  <input type="hidden" id="cin" name="cin" value="<%=GestionEtudiant.etudiants.get(i).getCin()%>">
	  <input type="submit" name="submit" value="Delete">
	 </div>
	 
	 </form>
	 <% }%>
</body>
</html>