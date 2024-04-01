package com.ohgiraffers.section02.formdata;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/formdata")
public class FormDataTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String name = request.getParameter("name");
        System.out.println("name = " + name);

        /* 필기.
        *   만약 클라이언트(프론트) 에서 요청한 데이터의
        *   key 와 value 를 하나하나 확인하기 힘들다?
        *   그러면 모든 데이터의 key 값을 이용하여
        *   전송된 값들을 일괄처리를 할 수 있다.
        *  */

        // getParameterMap();

        Map<String, String[]> requestMap = request.getParameterMap();
        Set<String> keySet = requestMap.keySet();

        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String[] value = requestMap.get(key);

            System.out.println("key : " + key);
            for(int i = 0; i < value.length; i++) {
                System.out.println("value[" + i + "] : " + value[i]);
            }
        }

        // 파라미터로 전달 된 키 목록만 확인할 수도 있다.
        // request.getParameterNames()

        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            System.out.println(names.nextElement());
        }

    }
}
