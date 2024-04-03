package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/first/*")
public class FirstFilter implements Filter {




    public FirstFilter(){
        System.out.println("FirstFilter 인스턴스 생성됨 !!!");
    }


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        /* 필기
            필터의 인스턴스가 (최초)생성 될 때 호출되는 메소드
         */
        System.out.println("Filter init() 호출됨...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        /* 필기.
            Servlet 으로 request 가 전달되기 전에 요청을 가로채는 메소드
         */
        System.out.println("Filter doFilter() 호출됨...");

        /* 필기. 필터에서 처리할 코드를 작성한다. */

        /* 필기. 처리를 한 뒤 다음 필터 혹은 서블릿의 doGet/doPost 를 호출한다. */
        filterChain.doFilter(servletRequest,servletResponse);

        /* 필기. 서블릿에서 처리 후에 다시 수행할 내용이 있다면 작성하는 공간 */

        System.out.println("Servlet 요청 수행완료 ");
    }

    @Override
    public void destroy() {

        /* 필기
            필터의 인스턴스가 소멸될 때 호출되는 메소드( = 톰캣을 종료할 떄)
         */
        System.out.println("First destory() 메소드 호출됨...");
    }
}
