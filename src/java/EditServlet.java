/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.SystemColor;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vishal
 */
@WebServlet(name="EditServlet",urlPatterns = {"/EditServlet"})
public class EditServlet extends HttpServlet {

    private String HREF;
    private SystemColor css;

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
           
        out.println("<h1>UPDATE STUDENT.....</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        Emp e=EmpDao.getEmployeeById(id);  
          
        out.print("<form action='EditServlet2' method='get'>");
        
        out.print("<html>");
        out.print("<body>");
        out.println("<head>");
        out.println("<table border=1 width=100% height=100%>");
        out.println("</head>");
        out.print("<table border=2 width=90% height=80%>");  
        out.print("<tr><td>Id:</td><td><input type='text' name='id' value='"+e.getId()+"'/></td></tr>");  
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");  
        out.print("<tr><td>stream:</td><td><input type='text' name='stream' value='"+e.getStream()+"'/></td></tr>");
        out.print("<tr><td>MobileNo:</td><td><input type='text' name='mno' value='"+e.getMno()+"'/></td></tr>");
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");
        out.print("<tr><td>Address:</td><td><input type='text' name='address' value='"+e.getAddress()+"'/></td></tr>");                     
        
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
        out.print("</body>");
        out.print("</html>");
          
        out.close();  
    }  
    }

}
