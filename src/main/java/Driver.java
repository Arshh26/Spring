import Pojo.Person;
import Pojo.Principal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Person person = context.getBean(Person.class);
        Principal principal = context.getBean(Principal.class);

        person.walk();
        principal.teach();
    }
}
