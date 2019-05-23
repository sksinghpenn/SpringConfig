import com.lifotech.spring.beans.ClassA;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        ClassA bean = container.getBean(ClassA.class);
        bean.businessMethod();

        container.close();
    }
}
