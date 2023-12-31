package servlet.stu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import entity.Homework;
import util.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/work")
public class WorkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sql = "select * from homework";
        List<Homework> workList = JdbcUtil.queryList(Homework.class, sql);
        JSONArray data = JSONArray.parseArray(JSON.toJSONString(workList));

        // return JSON-data
        JSONObject respJson = new JSONObject();
        respJson.put("code", 200);
        respJson.put("msg", "success");
        respJson.put("data", data);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        resp.getWriter().write(String.valueOf(respJson));
    }
}
