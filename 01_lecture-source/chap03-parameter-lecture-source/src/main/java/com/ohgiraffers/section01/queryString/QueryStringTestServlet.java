package com.ohgiraffers.section01.queryString;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;

@WebServlet("/querystring")
public class QueryStringTestServlet extends HttpServlet {

    /* 필기.
    *   HttpServlet 클래스의 service 메소드는 요청 방식에 따라
    *   GET 요청에 대해서 doGet() 메소드를 호출하면서
    *   request 와 response 를 전달한다.
    *  */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");

        System.out.println("name = " + name);

        int age = Integer.parseInt(request.getParameter("age"));

        System.out.println("age = " + age);

        java.sql.Date birthday = Date.valueOf(request.getParameter("birthday"));

        System.out.println("birthday = " + birthday);

        String gender = request.getParameter("gender");

        System.out.println("gender = " + gender);

        if(gender.equals("M")) {
            System.out.println("남자입니다~~");
        } else if(gender.equals("F")) {
            System.out.println("여자입니다.");
        }

        String national = request.getParameter("national");

        System.out.println("national = " + national);

        // checkbox 다중으로 입력을 받을 수 있어, 선택 된 값이 문자열 배열로 전달된다.
        // getParameter() -> x, getParameterValues()
        System.out.println("취미 : ");
        String[] hobbies = request.getParameterValues("hobbies");

        for(String hobby : hobbies) {
            System.out.println(hobby);
        }

    }
}
