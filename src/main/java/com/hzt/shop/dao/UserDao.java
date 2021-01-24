package com.hzt.shop.dao;

import com.hzt.shop.entity.User;

import java.sql.SQLException;

/**
 * @Description TODO
 * @Author hzt
 * @Date 2021/1/24 20:21
 */
public class UserDao extends BasicDao<User>{

    //插入用户数据
    public int insert(User user) throws SQLException {
        String sql = "insert into user values (?,?,?,?,?,?,?,?,0,?,?)";
        int i = this.update(sql, user.getUid(), user.getUsername(), user.getPassword(), user.getName()
                , user.getEmail(),user.getTelephone(), user.getBirthday()
                , user.getSex(), user.getCode(), user.getAddress());
        return i;
    }
}
