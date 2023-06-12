package servlet.common;

import com.alibaba.fastjson.JSONObject;
import entity.Student;
import entity.Teacher;
import util.JdbcUtil;
import util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String role = req.getParameter("role");
        JSONObject respJson = new JSONObject();

        if(role.equals("teacher")){
            String sql = "select * from teacher where username=?";
            List<Teacher> teacherslist = JdbcUtil.queryList(Teacher.class, sql, username);
            if (teacherslist != null) {
                if (teacherslist.get(0).getPassword().equals(password)) {
                    respJson.put("msg", "login success");
                    HttpSession session = req.getSession();
                    session.setAttribute("user", teacherslist.get(0));
                } else {
                    respJson.put("msg", "mi ma cuo wu");
                }
            }else{
                respJson.put("msg", "zhang hao bu cun zai");
            }
        }else{
            String sql = "select * from student where username=?";
            List<Student> studentlist = JdbcUtil.queryList(Student.class, sql, username);
            if (studentlist != null) {
                if (studentlist.get(0).getPassword().equals(password)) {
                    respJson.put("msg", "login success");
                    HttpSession session = req.getSession();
                    session.setAttribute("user", studentlist.get(0));
                } else {
                    respJson.put("msg", "mi ma cuo wu");
                }
            }else{
                respJson.put("msg", "zhang hao bu cun zai");
            }
        }

        respJson.put("code", 200);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        resp.getWriter().write(String.valueOf(respJson));
    }
}
