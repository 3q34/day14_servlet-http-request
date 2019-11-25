package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * Created by cdx on 2019/9/18.
 * desc:get和post方式请求参数的方法一样
 */
@WebServlet("/RequestParameter")
public class RequestParameter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        //post获取请求参数
        String name = request.getParameter("username");
//        System.out.println("post");
        System.out.println(name);
        String[] value = request.getParameterValues("hobby");
        for (String obj : value) {
            System.out.println(obj);
        }

        //获取所有参数的名称
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String name1 = names.nextElement();
            System.out.println(name1);
            String name2 = request.getParameter(name1);
            System.out.println(name2);
        }
        //获取所有参数的map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> keyset = parameterMap.keySet();
        for (String name3 : keyset) {
            System.out.println(name3+"////");
            String[] values = parameterMap.get(name3);
            for (String value1 : values) {
                System.out.println(value1);
            }
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //get获取请求参数
//        String name = request.getParameter("username");
//        System.out.println("get");
//        System.out.println(name);
        this.doPost(request, response);
    }
}
