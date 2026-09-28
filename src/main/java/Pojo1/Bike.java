package Pojo1;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehical {
    @Override
    public void drive() {
        System.out.println("Riding a Bike...");
    }
}
