<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title>Name</title>
</head>
<body>
<center>
    <h2>
<form action="/cookie" method="post" >
    Name: <input type=text name="userName" value="${nameAttrFromCookie}"/>
</form>
    </h2>
</center>
</body>
</html>