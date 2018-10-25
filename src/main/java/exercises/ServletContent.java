package exercises;


//1. Servlet, który wyświetli jakąkolwiek treść po GET na adres /content wypisując wynik bezpośrednio przez output streama obiektu response
//2. Servlet, który wyswietli stronę zawierającą listę obiektów ustawianych przez servlet w requescie

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/content")
public class ServletContent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Zad.1
//        resp.getOutputStream().print("To jest mój tekst");
        // Zad.2
        req.setAttribute("tekst", Arrays.asList("To jest mój tekst", "To jest mój drugi tekst", "To jest mój trzeci tekst"));
        req.getRequestDispatcher("content.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
