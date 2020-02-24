package com.jld.impl;

import com.jld.dao.Dog;
import com.jld.dao.UserDao;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * .
 *
 * @author jiangxin (jiangxin@zhengheyingshi.com)
 * @since 2020年02月24日 12时27分
 */
@Component("Mysqlimpl")
public class Mysqlimpl implements UserDao {

    @Value("aa")
    public String name;

    @Autowired
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@PostConstruct//初始化方法
    public void save() {
        System.out.println("mysql--save");
    }

    //@PreDestroy//销毁方法
    public void delete() {
        System.out.println("mysql--delete");
    }
}
