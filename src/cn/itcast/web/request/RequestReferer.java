package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdx on 2019/9/18.
 * desc:
 */
@WebServlet("/RequestReferer")
public class RequestReferer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer = request.getHeader("referer");
        System.out.println(referer);
        if (referer != null) {
            response.setContentType("text/html;charset=utf-8");
            if (referer.contains("/day14")) {
                System.out.println("正常播放。。。。");
                response.getWriter().write("正常播放。。。。");
            } else {
                System.out.println("想看电影吗？来优酷呀。。。。");
                response.getWriter().write("想看电影吗？来优酷呀。。。。");
            }
        }
    }
}
