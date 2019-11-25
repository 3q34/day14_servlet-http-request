package cn.itcast.web.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by cdx on 2019/8/30.
 * desc:GenericServlet抽象类
 * 将service方法抽象，其他方法空实现
 */
@WebServlet("/demo2")
public class servletDemo2 extends GenericServlet {
    private static final String TAG = "cn.itcast.web.servlet.servletDemo2";

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("demo2....");
    }
}
