<%@page contentType="text/html; charset=UTF-8" %>

<form action="/calculator" method="post">

    <br>
    NUMBER 1: <input style="font-size:25px" type="number" step="any" name="firstNumber"/>
    <br><br>
    <input type="radio" name="operator" value="+"/> +
    <input type="radio" name="operator" value="-"/> -
    <input type="radio" name="operator" value="*"/> *
    <input type="radio" name="operator" value="/"/> /
    <br><br>
    NUMBER 2: <input style="font-size:25px" type="number" step="any" name="secondNumber"/>
    <br><br>
    <input style="font-size:25px" type="submit" value="CALCULATE"/>
    <br><br>
    RESULT: <input style="font-size:25px" name="result" readonly="readonly"
           type="text" value="${result}"/>
</form>
