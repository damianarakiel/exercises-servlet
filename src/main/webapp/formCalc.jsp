<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" %>

<h2>
<form action="/calculator" method="post">

    <br>
    <fieldset>
        <legend> SIMPLE CALCULATOR </legend>
    <br>
    NUMBER 1: <input style="font-size:25px" type="number" step="any" name="firstNumber"/>
    <br><br>
    <select style="font-size:25px" name="operator">
        <option>-</option>
        <option>+</option>
        <option>*</option>
        <option>/</option>
    </select>
    <%--<input type="radio" name="operator" value="+"/> +--%>
    <%--<input type="radio" name="operator" value="-"/> ---%>
    <%--<input type="radio" name="operator" value="*"/> *--%>
    <%--<input type="radio" name="operator" value="/"/> /--%>
    <br><br>
    NUMBER 2: <input style="font-size:25px" type="number" step="any" name="secondNumber"/>
    <br><br>
    <input style="font-size:25px" type="submit" value="CALCULATE"/>
    <br><br>
    RESULT: <input style="font-size:25px" name="result" readonly="readonly" type="text" value="${result}"/>
</form>
</h2>
