package com.webwarp.sandbox.servlet3initializer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Config implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        // Do stuff during server startup.
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        // Do stuff during server shutdown.
    }
}