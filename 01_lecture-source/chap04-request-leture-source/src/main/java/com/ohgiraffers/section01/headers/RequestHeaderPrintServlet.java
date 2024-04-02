package com.ohgiraffers.section01.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/headers")
public class RequestHeaderPrintServlet extends HttpServlet {

    /* 필기
        헤더란 ?
        우리가 데어터를 전송할 때 이게 무슨 데이터야. 라고 알려주는 역할이다.
        1. General Header - 요청 과 응답 모두 적용되는 헤더, 상태 메세지를 나타낸다.
        2. Request Header - 조회 될 리소스(정보)나 클라이언트 자체에 대한 상세 정보를 포함
        3. Response Header - 응답에 대한 부가적인 정보를 갖고 있는 헤더
        4. Entity Header - 컨텐츠 길이, MIME 타입과 같은 바디에 대한 정보를 포함한다.
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       Enumeration<String> headerNames = req.getHeaderNames();
       while (headerNames.hasMoreElements()){
           System.out.println(headerNames.nextElement());
       }

        /* 필기 accept header : 클라이언트에서 웹서버로 request 할 시 요청할 수 있는 메세지에 담기는 헤더
            쉽게 설명하면 나는 출력 된 값들만 accept 즉 수용할 수 있어 라는 것과 같음 -> json -> 나는 json 를 받을거야 */
        System.out.println("accept : " + req.getHeader("accept"));   //필기

        System.out.println("cookie : " + req.getHeader("cookie"));   //필기 쿠키

    }
}
