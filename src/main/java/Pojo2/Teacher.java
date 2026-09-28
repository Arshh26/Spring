package Pojo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "singleton")
@Component
public class Teacher {

    public void teach() {
        System.out.println("Teacher created");
    }

}
