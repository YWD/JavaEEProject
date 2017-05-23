package com.afw.yang.sql;

import com.afw.yang.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

/**
 * Created by lenovo on 2017/5/23.
 *
 */
public class DBUtil {

    public static void main(String[] args) {
        QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
        String sql = "insert into category(cid, cname) values(?,?)";
        Object[] params = {"c006","家电"};
        try {
            queryRunner.update(sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
