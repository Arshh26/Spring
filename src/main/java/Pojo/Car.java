package Pojo;

public class Car {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.Start();
        System.out.println("Car is Driving");
    }

}
