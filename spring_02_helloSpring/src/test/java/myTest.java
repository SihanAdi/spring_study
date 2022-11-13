import com.adsh.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test(){
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象现在都在spring中管理了， 要使用，直接去里面取出
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
