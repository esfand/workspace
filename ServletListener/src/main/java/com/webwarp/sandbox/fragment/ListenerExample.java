package com.webwarp.sandbox.fragment;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListenerExample extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        
        PrintWriter pw = res.getWriter();
        pw.println("<h2>Student's Name and Address</h2>");
        pw.println("");
        
        Student stu  = (Student) getServletContext().getAttribute("stu");
        Student stu1 = (Student) getServletContext().getAttribute("stu1");
        
        pw.println("\n<b>" + stu .getName() + "</b> lives in <b>" + stu.getAdd() + "</b><br>");
        pw.println("\n<b>" + stu1.getName() + "</b> lives in <b>" + stu.getAdd() + "</b><br>");
    }
}
