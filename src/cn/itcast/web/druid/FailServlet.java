package cn.itcast.web.druid;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdx on 2019/10/29.
 * desc:
 */
@WebServlet("/FailServlet")
public class FailServlet extends HttpServlet {
    private static final String TAG = "SuccessServlet";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Object msg = req.getAttribute("msg");
        resp.getWriter().write(msg + ",登陆失败");
        System.out.println(msg + ",登陆失败");
    }
}
