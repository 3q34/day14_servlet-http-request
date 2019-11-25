package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdx on 2019/9/9.
 * desc:HttpServlet继承注释配置路径的不同方式
 */
//路径配置的方式
//1、@WebServlet({"/demo4", "/d4", "/dd4"})//定义访问的虚拟路径
//2、@WebServlet("/user/demo4")
//3、@WebServlet("/user/*")
//4、@WebServlet("/*")
@WebServlet("*.do")
public class servletDemo4 extends HttpServlet {
    private static final String TAG = "servletDemo4";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("demo4...");
        System.out.println(req);

//        HttpServletRequest
//        请求消息
//        HttpServletResponse
//        响应消息
    }
}
