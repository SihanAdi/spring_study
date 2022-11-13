import com.adsh.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    @Test
    public void test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationbeans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
