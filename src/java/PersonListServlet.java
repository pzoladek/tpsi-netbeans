import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {
    
    // EL zwykly a JSTL: bez roznicy

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Person> persons = new ArrayList<>();
        persons.add(getPerson(0));
        persons.add(getPerson(1));
        persons.add(getPerson(2));
        persons.add(getPerson(3));
        
        
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("personList.jsp").forward(request, response);

    }
    
    private Person getPerson(int id) {
        return new Person("name" + id, "lastname" + id, "em@il" + id + ".com");
    }
}