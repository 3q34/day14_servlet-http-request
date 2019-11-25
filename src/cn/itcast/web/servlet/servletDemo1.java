package cn.itcast.web.servlet;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by cdx on 2019/8/30.
 * desc:WebServlet("/demo1")注释配置urlpattern
 */
@WebServlet("/demo1")
public class servletDemo1 implements Servlet {
    private static final String TAG = "servletDemo1";

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("demo1....");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
