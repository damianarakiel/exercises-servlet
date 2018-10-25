package exercises;

//5. Formularz, w którym można podać imię, które później zostanie zapisane w ciastku i odesłane do klienta. Następnie, servlet ma obsługiwać te ciastka tak, aby jakaś strona jsp miała dostęp do tych danych np. poprzez atrybut w request (zachowanie w przeglądarce powinno wyglądać dla użytkownika tak samo jak w 4)

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/cookie")
public class ServletCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        HttpSession session = req.getSession();
        req.setAttribute("userName", session.getAttribute("userName"));
        req.getRequestDispatcher("cookie.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("userName");
        Cookie cookie = new Cookie("userName", value);
        resp.addCookie(cookie);
        HttpSession session = req.getSession();
        session.setAttribute("userName", value);
        System.out.println(cookie.getValue());
        resp.sendRedirect("cookie");
    }
}
