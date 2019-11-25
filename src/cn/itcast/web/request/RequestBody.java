package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by cdx on 2019/9/18.
 * desc:获取请求消息数据：获取字符输入流
 * desc:获取请求消息数据：获取字符输入流
 */
@WebServlet("/RequestBody")
public class RequestBody extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取字符输入流，只能操作字符数据
        BufferedReader bufferedReader = request.getReader();
        int len=0;
        String line;
        while ((line=bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        //获取字节输入流，可以操作所有类型数据
        //文件上传知识点再学习
//        ServletInputStream servletInputStream = request.getInputStream();
//        while ((len=servletInputStream.read())!=0){
//
//        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
