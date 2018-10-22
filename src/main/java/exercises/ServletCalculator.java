package exercises;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class ServletCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double firstNumber = Double.parseDouble(req.getParameter("firstNumber"));
        double secondNumber = Double.parseDouble(req.getParameter("secondNumber"));
        String operator = req.getParameter("operator");
//        double result = Double.parseDouble(req.getParameter("result"));
        String resultString = req.getParameter("result");

        double result = 0;
        if (!resultString.isEmpty()) {
            result = Double.parseDouble(resultString);
        }

        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            result = firstNumber / secondNumber;
        }

        /*if (operator.equals("add")) {
            double add = firstNumber + secondNumber;
            resp.getOutputStream().print("<h1>Result: " + firstNumber + " + " + secondNumber + " = " + add + "</h1>");
        } else if (operator.equals("subtract")) {
            double sub = firstNumber - secondNumber;
            resp.getOutputStream().print("<h1>Result: " + firstNumber + " - " + secondNumber + " = " + sub + "</h1>");
        } else if (operator.equals("multiply")) {
            double mul = firstNumber * secondNumber;
            resp.getOutputStream().print("<h1>Result: " + firstNumber + " * " + secondNumber + " = " + mul + "</h1>");
        } else if (operator.equals("divide")) {
            double div = firstNumber / secondNumber;
            resp.getOutputStream().print("<h1>Result: " + firstNumber + " / " + secondNumber + " = " + div + "</h1>");
        }*/

        req.setAttribute("result", /*firstNumber + " " + operator + " " + secondNumber + " = " +*/ result);
        req.getRequestDispatcher("/").forward(req, resp);
    }
}
