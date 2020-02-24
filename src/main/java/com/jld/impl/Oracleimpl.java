package com.jld.impl;

import com.jld.dao.UserDao;

/**
 * .
 *
 * @author jiangxin (jiangxin@zhengheyingshi.com)
 * @since 2020年02月24日 12时28分
 */
public class Oracleimpl implements UserDao {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void save() {
        System.out.println("oracle--save");
    }

    public void delete() {
        System.out.println("oracle--delete");
    }
}
