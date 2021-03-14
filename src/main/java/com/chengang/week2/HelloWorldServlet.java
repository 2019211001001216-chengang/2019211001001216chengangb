package com.chengang.week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloWorldServlet extends HttpSerlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws IOException {
        Prinwriter writer =response.getWriter();
        writer.println("Hello Client!!!");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){

    }
}
