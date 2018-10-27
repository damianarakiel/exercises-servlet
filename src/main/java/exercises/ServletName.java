package exercises;

//4. Formularz, w którym można podać imię i które będzie pamiętane przez serwer (sesja)i zademonstrować to na przykładowej stronie jsp

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/name")
public class ServletName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("userName", req.getSession().getAttribute("userName"));
        req.getRequestDispatcher("name.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        HttpSession session = req.getSession();
        session.setAttribute("userName", name);
        resp.sendRedirect("name");
    }
}
