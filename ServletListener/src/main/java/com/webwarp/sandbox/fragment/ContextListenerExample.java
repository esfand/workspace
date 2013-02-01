package com.webwarp.sandbox.fragment;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletException;

public class ContextListenerExample implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent e) {
        ServletContext cntxt = e.getServletContext();
        
        Student stu  = new Student("Bipul", "Rohini");
        Student stu1 = new Student("Vinay", "Rohini");
        
        cntxt.setAttribute("stu",  stu);
        cntxt.setAttribute("stu1", stu1);
    }

    @Override
    public void contextDestroyed(ServletContextEvent e) {
        System.out.println("Destroyed");
    }
}
