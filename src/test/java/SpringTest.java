import com.jld.dao.SpringAop;
import com.jld.dao.UserDao;
import com.jld.impl.Mysqlimpl;
import com.jld.impl.Oracleimpl;
import com.jld.impl.Taop;
import java.util.Arrays;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * .
 *
 * @author jiangxin (jiangxin@zhengheyingshi.com)
 * @since 2020年02月24日 12时45分
 */
public class SpringTest {

    @Test
    public void test(){
       //1.加载配置文件
        ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("applicationContext2.xml");

        //根据id获取对象
        Oracleimpl userDao = (Oracleimpl)applicationContext.getBean("UserDao");

//        userDao.delete();
//        userDao.save();
        System.out.println(userDao.getName());
        System.out.println(userDao.getDog().getName());
        System.out.println(userDao.getDogname());
        System.out.println(Arrays.toString(userDao.getNum()));
        System.out.println(userDao.getList());
        System.out.println(userDao.getMap());
        System.out.println(userDao.getSet());
        //关闭工厂
        ((ClassPathXmlApplicationContext)applicationContext).close();

    }

    @Test
    public void test2(){
        ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("applicationContext.xml");
        Mysqlimpl userDao = (Mysqlimpl)applicationContext.getBean("Mysqlimpl");
        userDao.save();
        System.out.println(userDao.name);
        System.out.println(userDao.getDog().getName());
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("applicationContext4.xml");

        Taop aop = (Taop)applicationContext.getBean("taop");
        aop.name();
    }
}
