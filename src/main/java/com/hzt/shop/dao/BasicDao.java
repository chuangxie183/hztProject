package com.hzt.shop.dao;

import com.hzt.shop.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

/**
 * @Description TODO
 * @Author hzt
 * @Date 2021/1/24 20:21
 */
public class BasicDao<T> {
    QueryRunner runner = new QueryRunner();

    //增删改
    public int update(String sql,Object...params) throws SQLException {
        int i = runner.update(DataSourceUtils.getConnection(),sql, params);
        return i;
    }


    //查询单个值

    //查询多个值
}
