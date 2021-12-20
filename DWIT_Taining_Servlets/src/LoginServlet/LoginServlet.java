package LoginServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pc on 12/15/2021.
 */
@WebServlet
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("username");
        String pass = request.getParameter("password");

      /*  String gender = request.getParameter("gender");
        String course = request.getParameter("course");
        String sport[] = request.getParameterValues("sport");*/


        /*System.out.println(name);
        System.out.println(pass);*/

        PrintWriter out = response.getWriter();

        /*String htmlRes = "<html>";
        htmlRes = htmlRes + "<p> hello"+ name + "</p>";
        htmlRes = htmlRes+ "</html>";
        out.print(htmlRes);*/



        /*out.print("hello "+ name +" your password is "+ pass + " and you are of gender "+ gender + " and you read "+ course );
        if(sport != null){
            for (String str:sport
                    ) {
                out.print("you play " + str);
            }
        }*/

        //CHECK PASSWORD
        if(pass.equals("java")){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("dashboard");
            requestDispatcher.forward(request,response);
        }
        else
        {
            out.print("incorrect password");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
            requestDispatcher.include(request,response);
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


    }
}
