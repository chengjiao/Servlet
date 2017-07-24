package com.cj.servlet2;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by CJ on 2017/7/24.
 */
public class PrimitiveServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
        PrintWriter out = servletResponse.getWriter();
        out.println("Hello.Rose and Red ");
        out.println("Violets are blue.");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
