import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if ("admin".equals(user) && "1234".equals(pass)) {
            out.println("<h3>Welcome, " + user + "!</h3>");
        } else {
            out.println("<h3>Invalid Credentials. Please try again.</h3>");
        }
    }
}
