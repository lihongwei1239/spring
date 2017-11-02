package com.spring.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;

public class MyServletInitalizer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet", MyServlet.class);//注册Servlet
        myServlet.addMapping("/custom/");//映射servlet

        FilterRegistration.Dynamic myFilter = servletContext.addFilter("myFilter", MyFilter.class); //添加Filter
        myFilter.addMappingForUrlPatterns(null,false,"/custom/**"); //添加Filter的映射路径

        DispatcherServlet ds = new DispatcherServlet();
        ServletRegistration.Dynamic appServlet = servletContext.addServlet("appServlet",ds);
        appServlet.addMapping("/");
        appServlet.setMultipartConfig(new MultipartConfigElement("/tmp/spilttr/uploads",1024,1024,0));
    }

}
