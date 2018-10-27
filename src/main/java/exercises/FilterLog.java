package exercises;

//6. Filtr, który będzie logował wszystkie requesty (na jaki adres, jaka metoda http, jakie parametry)

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class FilterLog extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter log message");
        System.out.println(req.getParameter("userName"));
        System.out.println("HTTPMethod: " + req.getMethod());

        req.setAttribute("decodeParams", "param0");

        chain.doFilter(req, res);
    }

}
