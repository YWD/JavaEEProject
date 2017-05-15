package com.afw.yang;

import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lenovo on 2017/5/12.
 * 第一个测试Servlet
 */
@WebServlet("/A")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("receive:" + req.getMethod());

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        // TODO: 2017/5/12 lib jar ceshi
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "jack");
        jsonObject.put("age", 23);

        PrintWriter writer = resp.getWriter();
        writer.println(jsonObject);
    }
}
