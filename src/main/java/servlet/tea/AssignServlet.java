package servlet.tea;

import com.alibaba.fastjson.JSONObject;
import util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/assign")
public class AssignServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // receive JSON-data
        JSONObject data= JsonUtil.getJson(req);
        if (data!=null){
            // ...
        }


        // return JSON-data
        JSONObject respJson = new JSONObject();
        respJson.put("code", 200);
        respJson.put("msg", "success");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        resp.getWriter().write(String.valueOf(respJson));
    }
}
