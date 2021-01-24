package com.hzt.shop.service;

import com.hzt.shop.dao.UserDao;
import com.hzt.shop.entity.User;

import java.sql.SQLException;

/**
 * @Description TODO
 * @Author hzt
 * @Date 2021/1/24 20:22
 */
public class UserService {

    private UserDao dao = new UserDao();

    //注册
    public boolean regist(User user){
        try {
            return dao.insert(user)>0 ? true :false ;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
