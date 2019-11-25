package cn.itcast.web.druid;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by cdx on 2019/10/29.
 * desc:登录练习
 */
@WebServlet("/LoginTest")
public class LoginTest extends HttpServlet {
    private static final String TAG = "LoginTest";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hahha");
        req.setCharacterEncoding("utf-8");
//        String name = req.getParameter("username");
//        String psw = req.getParameter("password");
//        User loginUser = new User(name, psw);
        //将请求的所有参数封装到Map中
        Map<String, String[]> parameterMap = req.getParameterMap();
        User loginUser = new User();
        //req.setAttribute("msg", name);
        try {
            //将Map封装到JavaBean中
            BeanUtils.populate(loginUser, parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        req.setAttribute("msg", loginUser.getUsername());
        UserDao dao = new UserDao();
        int count = dao.login(loginUser);
        if (count == 1)
            req.getRequestDispatcher("/SuccessServlet").forward(req, resp);
        else
            req.getRequestDispatcher("/FailServlet").forward(req, resp);
    }
}
