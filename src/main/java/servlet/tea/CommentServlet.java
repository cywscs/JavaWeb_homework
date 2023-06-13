package servlet.tea;

import com.alibaba.fastjson.JSONObject;
import entity.StuWork;
import util.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/comment")
public class CommentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String workId = req.getParameter("id");
        String score = req.getParameter("score");
        String comment = req.getParameter("comment");

        String sql1 = "select * from stu_work where id = ?";
        List<StuWork> stuWorkList = JdbcUtil.queryList(StuWork.class, sql1, workId);
        StuWork work = stuWorkList.get(0);
        work.setScore(score);
        work.setComment(comment);
        String sql2 = "insert into ";


        JSONObject respJson = new JSONObject();
        respJson.put("code", 200);
        respJson.put("msg", "success");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        resp.getWriter().write(String.valueOf(respJson));
    }
}
