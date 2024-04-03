package com.ohgiraffers.section01.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("여기니?");

//        resp.sendRedirect("redirect");

        /* 필기. 쿠키 조리법
            1. 쿠키를 생성한다.
            2. 생성한 쿠키에 만료 시간을 정한다.
            3. 응답 헤더에 쿠키를 담는다.
            4. 응답을 보낸다
         */
        /* 필기 1. 쿠키 생성*/
        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        firstNameCookie.setMaxAge(60 * 60 * 24);   // 초 단위 설정 (하루 만료)
        lastNameCookie.setMaxAge(60 * 60 * 24);

        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCookie);

        resp.sendRedirect("redirect");


    }
}
