package com.webwarp.sandbox.servlet3initializer;
//package com.nullhaus;

import java.util.Set;
import java.util.logging.Logger;
import javax.servlet.*;


public class MyInitializer implements ServletContainerInitializer {
    private static final Logger LOG = Logger.getLogger(MyInitializer.class.getName());
    
   @Override
   public void onStartup(Set<Class<?>> c, ServletContext cx) {
       System.out.println("--- CONTAINER INITIALIZER! ---");
   }
}