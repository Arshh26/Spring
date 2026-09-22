import Pojo.Car;
import Pojo.Engine;
import Pojo.Person;
//import Pojo.Principal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Person person = context.getBean(Person.class);
        Car car = context.getBean(Car.class);
        Engine engine = context.getBean(Engine.class);



        person.walk();
        car.drive();
        engine.Start();
//        principal.teach();
    }
}
