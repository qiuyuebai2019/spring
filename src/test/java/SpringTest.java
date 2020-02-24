import com.jld.dao.UserDao;
import com.jld.impl.Oracleimpl;
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
        //关闭工厂
        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
