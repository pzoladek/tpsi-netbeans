import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "StudentSessionServlet", urlPatterns = {"/student"})
public class StudentSessionServlet extends HttpServlet {

    private static Integer VISIT = 0;
   
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        // zad 1
        Integer visitCounter = (Integer) session.getAttribute("visitCounter");
        if (visitCounter == null) VISIT = 0;
        else VISIT++;
        session.setAttribute("visitCounter", VISIT);
        
        
        request.getRequestDispatcher("student.jsp").forward(request, response);
    }
   
}