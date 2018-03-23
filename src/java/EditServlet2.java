/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(name="EditServlet2",urlPatterns = {"/EditServlet2"})
public class EditServlet2 extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
           String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String name=request.getParameter("name");  
        String stream=request.getParameter("stream");
        String mno=request.getParameter("mno");
        String email=request.getParameter("email");  
        String address=request.getParameter("address");
         
        Emp e=new Emp();  
        e.setId(id);  
        e.setName(name);  
        e.setStream(stream); 
        e.setMno(mno);
        e.setEmail(email);  
        e.setAddress(address);
                  
        int status=EmpDao.update(e);
        if(status>0){  
            response.sendRedirect("ViewServlet");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  
        }
    
