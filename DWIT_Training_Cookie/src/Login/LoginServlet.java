package Login;

import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pc on 12/20/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String username = request.getParameter("username");
        //we dnt take passowrd and store in cookie coz it will be stored in plain text and  is seen by hackers

        Cookie cookie = new Cookie("cookiename",username);
        response.addCookie(cookie);
        cookie.setMaxAge(2);
        printWriter.println("welcome "+ username);

        printWriter.println("<form action='/dash' method='POST'>");
        printWriter.println("<input type='submit' value='go'>");
        printWriter.println("</form>");

        printWriter.close();



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
