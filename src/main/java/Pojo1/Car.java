package Pojo1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehical {
    @Override
    public void drive() {
        System.out.println("Driving a Car...");
    }
}
