package com.ohgiraffers.section02.uses;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/* 목차 xml 방식으로 filter 등록해보기 */
public class EncodingFilter implements Filter {

    private String encodingType;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        /* 필기. xml 설정한 init-param 의 key를 이용하여 config 에서 값을 꺼낼 수 있다.  */
        encodingType = filterConfig.getInitParameter("encoding-type");   // 필기 인코딩 타입 xml 에서 불러오기
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletResponse response = (HttpServletResponse) servletResponse;       // 필기   리스폰이랑 리퀘스트 차이가뭘까??

        response.setContentType(encodingType);   // 필기 위에 설정했던 타입 가져오기

        filterChain.doFilter(servletRequest , servletResponse); // 필기 filterChain 으로 보내줄때는 req , resp 으로 보내줘야함 doFilter 자세한건 들어가보셈



    }

    @Override
    public void destroy() {



    }
}
