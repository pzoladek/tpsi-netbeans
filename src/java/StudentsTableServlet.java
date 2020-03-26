/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author pawel.zoladek
 */
@WebServlet(name = "StudentsTableServlet", urlPatterns = {"/studentsTable"})
public class StudentsTableServlet extends HttpServlet {
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String email = request.getParameter("email");
        Person person = new Person(imie, nazwisko, email);
        
        HttpSession session = request.getSession();
        List<Person> students = (List<Person>) session.getAttribute("students");
        if (students == null) {
            students = new ArrayList<>();
        }
        
        students.add(person);

        session.setAttribute("students", students);
        request.getRequestDispatcher("studentsTable.jsp").forward(request, response);

    }
     
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        HttpSession session = request.getSession();
        
        List<Person> students = (List<Person>) session.getAttribute("students");
        if (students == null) {
            students = new ArrayList<>();
        }
        
        session.setAttribute("students", students);
       
        request.getRequestDispatcher("studentsTable.jsp").forward(request, response);

    }
}
