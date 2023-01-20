package com.kls.gitdemo.dao;

import com.kls.gitdemo.entity.User;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kangqing
 * @since 2023/1/20 08:02
 */
@Component
public class UserDao {
    public Object selectOne(User user) {
        String sql = "select id from user where name = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC", "root", "5678");
            //创建语句对象
            ps = conn.prepareStatement(sql);
            //给占位符赋值
            ps.setObject(1, user.getName());
            final ResultSet resultSet = ps.executeQuery();
            String str = null;
            if (resultSet.next()) {
                str = resultSet.getString(1);
                System.out.println(str);
            }

            return str;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
