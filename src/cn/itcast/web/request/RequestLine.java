package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdx on 2019/9/17.
 * desc:演示Request请求行数据
 * 各种方法
 */
@WebServlet("/day14/RequestLine")
public class RequestLine extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // GET /day14/RequestLine?username=zhangsan HTTP/1.1
        request.setCharacterEncoding("utf-8");
        //Get
        String method = request.getMethod();
        System.out.println(method);
        // /day14
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        // /RequestLine
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        //请求参数获取username=username=zhangsan
        String querystring = request.getQueryString();
        System.out.println(querystring);
        //   /day14/RequestLine获取请求的URI
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        //  http://localhost/day14/RequestLine
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
        //获取协议
        String protocol = request.getProtocol();
        System.out.println(protocol);
        //获取客户机的IP
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
