package com.afw.yang.sql;

import com.afw.yang.bean.Category;
import com.afw.yang.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/5/23.
 */
public class DBUtil {

    public static void main(String[] args) {
        QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
//        String sql = "insert into category(cid, cname) values(?,?)";
//        Object[] params = {"c006","家电"};
        String sql = "select * from category";
        Object[] params = {};

        try {
            /*List<Category> query = queryRunner.query(sql, new BeanListHandler<Category>(Category.class), params);
            for (Category category : query) {
                System.out.println("cid:" + category.getCid() + ";cname:" + category.getCname());
            }*/
            Map<String, Map<String, Object>> query = queryRunner.query(sql, new KeyedHandler<String>(), params);

            for (String str : query.keySet()) {
                System.out.println(str);
            }
//            queryRunner.update(sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
