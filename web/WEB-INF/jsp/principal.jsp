<%-- 
    Document   : principal
    Created on : 03/08/2016, 20:59:29
    Author     : raphael.silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Estatísticas de Futebol</title>
  </head>
  <body>
    <h1>Estatísticas da Euro 2016</h1>
    <label for="selecoes">Escolha uma seleção: </label>
    <select name="selecoes">
      <c:forEach items="${teams}" var="team">
          <option>${team.SName}</option>
      </c:forEach>
    </select> 
  </body>
</html>
