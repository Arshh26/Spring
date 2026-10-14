//import BeanLifeCycle.Vehicle;
import EmailService.NotificationService;
import Pojo2.Teacher;
import config1.MyConfig;
import Pojo1.Person;
//import config1.VehicleConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        NotificationService service = context.getBean(NotificationService.class);
        service.notifyUser();



//        Teacher teacher = context.getBean(Teacher.class);
//        Teacher teacher1 = context.getBean(Teacher.class);
//
//        System.out.println(teacher);
//        System.out.println(teacher1);
//
//        teacher.teach();
//
//
//        System.out.println(teacher == teacher1);


//        Person person = context.getBean(Person.class);
//
//        person.travel();
    }
}