import com.adsh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        user.show();
        User user2 = (User) context.getBean("userNew");
        user2.show();
        System.out.println(user2 == user);
    }
}
