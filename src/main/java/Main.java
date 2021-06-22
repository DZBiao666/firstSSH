import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String argv[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Dao dao= (Dao) context.getBean("user");
        System.out.println(dao.getUserid());
    }
}
