package LoginPackage;

import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

/**
 * Created by pc on 12/17/2021.
 */
public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            response.setContentType("text/html");
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if(username.equals("shree@gmail.com") && password.equals("java")){
//                RequestDispatcher requestDispatcher = request.getRequestDispatcher("dashboard");
//                requestDispatcher.forward(request,response);

//                response.sendRedirect("dashboard");
            }
            else{
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                requestDispatcher.include(request,response);
            }
        }

}
