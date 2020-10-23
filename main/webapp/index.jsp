<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 茵羽
  Date: 2020/10/21
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
    %>

</head>
<body>
<form action="${APP_PATH}/emp" method="post">
    <input type="text" name="id"><br>
    <input type="submit">
</form>
</body>
</html>
