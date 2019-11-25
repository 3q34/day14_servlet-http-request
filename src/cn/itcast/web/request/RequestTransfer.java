package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdx on 2019/9/23.
 * desc:请求转发
 */
@WebServlet("/RequestTransfer")
public class RequestTransfer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("RequestTransfer执行了.。。。。。");


        //共享资源
        //一次请求的范围，转发的多个资源中共享数据
        request.setAttribute("msg", "hehhehhe");
        //转发到demo9
        request.getRequestDispatcher("/RequestDemo9").forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
