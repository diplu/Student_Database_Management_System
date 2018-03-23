
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
@WebServlet(name="SaveServlet",urlPatterns = {"/SaveServlet"})
public class SaveServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
      try( PrintWriter out = response.getWriter()){
              
            int id = Integer.parseInt(request.getParameter("id"));
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
            
            int status=EmpDao.save(e);
            if(status>0){
                out.print("<p>RECORD SAVED SUCESSFULLY.</p>");
                request.getRequestDispatcher("index.html").include(request, response);
            }else{
                out.println("Sorry! unable to save record");
            }
        }  
        }
    
}
  

