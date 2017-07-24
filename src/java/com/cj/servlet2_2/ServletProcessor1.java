package com.cj.servlet2_2;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

/**
 * Created by CJ on 2017/7/24.
 */
public class ServletProcessor1 {
    public void process(Request request,Response response){
        String uri = request.getUri();
        String servletName = uri.substring(uri.lastIndexOf("/")+1);
        URLClassLoader loader = null;
        try{
            URL[] urls = new URL[1];
            URLStreamHandler streamHandler = null;
            File classPath = new File(Constants.WEB_ROOT);
            String repository = (new URL("file,null,classPath.getCanonicalPath()+File,separator")).toString();
            urls[0] = new URL(null,repository,streamHandler);
            loader = new URLClassLoader(urls);
        }catch (IOException e){
            System.out.println(e.toString());
        }
        Class myClass = null;
        try{
            myClass = loader.loadClass(servletName);
        }catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
        Servlet servlet = null;
        try {
            servlet = (servlet)myClass.newInstance();
            servlet.service((ServletRequest)request,(ServletResponse)response);
        }catch (Exception e){
            System.out.println(e.toString());
        }catch (Throwable e){
            System.out.println(e.toString());
        }
    }
}
