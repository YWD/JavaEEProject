package com.afw.yang.sql;

import com.afw.yang.utils.JDBCUtil;

import java.sql.*;

/**
 * Created by afw on 2017/5/23.
 *
 */
public class SQLConnection {

    public static void main(String[] args) {
        try {
           /* // 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 获得连接
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itheima", "root", "123456");*/
           Connection conn = JDBCUtil.getConnection();
            // 获得语句执行者
            Statement statement = conn.createStatement();
            // 执行语句
            ResultSet resultSet = statement.executeQuery("select * from category");
            // 输出查询结果
            while (resultSet.next()) {
                System.out.println("id:" + resultSet.getString("cid") + ";" + "name:" + resultSet.getString(2));
            }
            // 释放资源
            /*resultSet.close();
            statement.close();
            conn.close();*/
            JDBCUtil.closeResources(resultSet, statement, conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
