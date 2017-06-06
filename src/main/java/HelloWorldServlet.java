import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();


        String name = request.getParameter("name");
        if (name == null) {
            out.println("<h1>Hello world</h1>");
        } else
            out.printf("<h1>Hello " + name + "</h1>");
    }
}


