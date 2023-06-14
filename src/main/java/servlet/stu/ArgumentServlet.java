package servlet.stu;

import com.alibaba.fastjson.JSONObject;
import entity.Homework;
import entity.StuWork;
import util.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/argument")
public class ArgumentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Integer stuid = Integer.parseInt(id);
        String argument = req.getParameter("argument");

        String sql1 = "select * from stu_work where id = ?";
        List<StuWork> stuWork = JdbcUtil.queryList(StuWork.class, sql1, stuid);
        StuWork work = stuWork.get(0);
        JdbcUtil.exeUpdate("delete from stu_work where id = ?", stuid);
        String sql2 = "insert into stu_work value(?, ?, ?, ?, ?, ?, ?, ? ,?)";
        JdbcUtil.exeUpdate(sql2, work.getId(), work.getWork_id(), work.getStu_id(), work.getAttachment(),
                work.getAnswer(), work.getStatus(), work.getScore(), work.getComment(), argument);

        JSONObject respJson = new JSONObject();
        respJson.put("code", 200);
        respJson.put("msg", "success");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        resp.getWriter().write(String.valueOf(respJson));
    }
}
