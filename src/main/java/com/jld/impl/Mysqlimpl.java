package com.jld.impl;

import com.jld.dao.UserDao;

/**
 * .
 *
 * @author jiangxin (jiangxin@zhengheyingshi.com)
 * @since 2020年02月24日 12时27分
 */
public class Mysqlimpl implements UserDao {
    public void save() {
        System.out.println("mysql--save");
    }

    public void delete() {
        System.out.println("mysql--delete");
    }
}
