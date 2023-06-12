package servlet.common;

import com.alibaba.fastjson.JSONObject;
import util.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String role = req.getParameter("role");
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String grade = req.getParameter("grade");
        JSONObject respJson = new JSONObject();

        if(role.equals("teacher")){
            String sql = "insert into teacher value(null, ?, ?, ?)";
            JdbcUtil.exeUpdate(sql, username, password, name);
            respJson.put("msg", "sign up success");
        }else{
            String sql = "insert into student value(null, ?, ?, ?, ?)";
            JdbcUtil.exeUpdate(sql, username, password, name, grade);
            respJson.put("msg", "sign up success");
        }


        respJson.put("code", 200);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        resp.getWriter().write(String.valueOf(respJson));
    }
}
