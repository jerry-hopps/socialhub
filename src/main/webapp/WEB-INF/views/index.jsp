<%--
  Created by IntelliJ IDEA.
  User: tonyshi
  Date: 2016/12/22
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<form action="<c:url value="/connect/facebook" />" method="POST">
    <p><button type="submit" value="Facebook">Facebook</button></p>
</form>

<form action="<c:url value="/connect/weibo" />" method="POST">
    <p><button type="submit" value="Weibo">Weibo</button></p>
</form>
</body>
</html>
