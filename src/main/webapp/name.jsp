<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; UTF-8" %>

<html>
<head>
    <title>Name</title>
</head>
<body>
<center>
    <h2>
<form action="/name" method="post" >
    Give me your name: <input type=text name="userName"/>
</form>
<c:out value = "Hi ${userName}"/>
    </h2>
</center>
</body>
</html>