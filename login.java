package com.login;
import java.io.I0Exception;
public class Login extends HttpServlet{
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,I0Exception{
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        if(uname.equals("krishna")&&pass.equals("teja"))
        {
            HttpSession session=request.getSession();
            session.setAttribute("username",uname);
            response.sendRedirect("index.html");
        }
        else
        {
            response.sendRedirect("login.jsp");
        }
    }

}