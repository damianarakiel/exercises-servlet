package exercises;

//5. Formularz, w którym można podać imię, które później zostanie zapisane w ciastku i odesłane do klienta. Następnie, servlet ma obsługiwać te ciastka tak, aby jakaś strona jsp miała dostęp do tych danych np. poprzez atrybut w request (zachowanie w przeglądarce powinno wyglądać dla użytkownika tak samo jak w 4)

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.stream.Stream;

@WebServlet("/cookie")
public class ServletCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cookieValue = null;
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            cookieValue = Stream.of(cookies).filter(cookie -> "nameCookie".equals(cookie.getName())).findAny().map(Cookie::getValue).orElse("DEFAULTNAME");
        }
        req.setAttribute("nameAttrFromCookie", cookieValue);
        req.getRequestDispatcher("cookie.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.addCookie(new Cookie("nameCookie", req.getParameter("userName")));
        resp.sendRedirect("cookie");
    }
}
