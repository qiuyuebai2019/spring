package com.jld.dao;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * .
 *
 * @author jiangxin (jiangxin@zhengheyingshi.com)
 * @since 2020年02月24日 17时19分
 */
@Aspect
public class A {

    @Before(value = "execution(* com.jld.dao.B.b(..))")
    public void a(){
        System.out.println("a");
    }
}
