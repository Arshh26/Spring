package Pojo;

public class Person {

    private String name;
    private int age;

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    public Person() {
//        System.out.println("Person Object is Created");
//    }

    public void walk() {
        System.out.println(name + " Unlocked the car");

    }
}
