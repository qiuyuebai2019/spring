package com.jld.impl;

import com.jld.dao.Dog;
import com.jld.dao.UserDao;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * .
 *
 * @author jiangxin (jiangxin@zhengheyingshi.com)
 * @since 2020年02月24日 12时28分
 */
public class Oracleimpl implements UserDao {

    private String name;

    private Dog dog;

    private String dogname;

    private String[] num;

    private List list;

    private Set set;

    private Map map;

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String[] getNum() {
        return num;
    }

    public void setNum(String[] num) {
        this.num = num;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

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
