package Pojo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Person {
    @Autowired
    @Qualifier(value = "bike")
    private Vehical vehical;

    public Person( Vehical vehical) {
        this.vehical = vehical;
    }

    public void travel() {
        vehical.drive();
        System.out.println("Person is traveling...");
    }
}
