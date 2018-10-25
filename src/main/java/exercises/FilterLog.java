package exercises;

//6. Filtr, który będzie logował wszystkie requesty (na jaki adres, jaka metoda http, jakie parametry)

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/cookie")
public class FilterLog implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        System.out.println("filter log message");
//        System.out.println(request.getParameter("userName"));
        httpServletRequest.getMethod();
        httpServletRequest.getParameterNames();
        httpServletRequest.getRemoteAddr();
        chain.doFilter(request, response);

    }
}
