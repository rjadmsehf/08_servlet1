package com.ohgiraffers.section02.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

@WebServlet("/headers")
public class ResponseHeaderPrintServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out =resp.getWriter();

        long currentTime = System.currentTimeMillis();

        out.print("<h1>" + currentTime + "</h1>");

        out.close();

        Collection<String> responseHeaders = resp.getHeaderNames();
        Iterator<String> iter = responseHeaders.iterator();

        while (iter.hasNext()){
            String headerName = iter.next();
            System.out.println(headerName + " : " + resp.getHeaders(headerName));

        }
    }
}
