import com.adsh.config.AdshConfig;
import com.adsh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    @Test
    public void test(){
        //如果完全使用配置类，我们就只能通过 AnnotationConfigApplicationContext来获取容器，通过配置类的cLass对象加载
        ApplicationContext Context = new AnnotationConfigApplicationContext(AdshConfig.class);
        User user = Context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
