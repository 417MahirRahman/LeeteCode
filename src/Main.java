import java.util.List;
abstract class Vehicle{
    int wheel;
    boolean engine;
    public Vehicle(int wheel, boolean engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public abstract void move();
}
class Car extends Vehicle{
    public Car(int wheel, boolean engine) {
        super(wheel, engine);
    }

    public void move(){
        System.out.println("The Car is Moving");
    }
}

class Rickshaw extends Vehicle{
    public Rickshaw(int wheel, boolean engine) {
        super(wheel, engine);
    }
    public void move(){
        System.out.println("The Rickshaw is Moving");
    }
}

class Bus extends Vehicle{
    public Bus(int wheel, boolean engine) {
        super(wheel, engine);
    }
    public void move(){
        System.out.println("The Bus is Moving");
    }
}

class Bicycle extends Vehicle{
    public Bicycle(int wheel, boolean engine) {
        super(wheel, engine);
    }
    public void move(){
        System.out.println("The Bycycle is Moving");
    }
}
class Truck extends Vehicle{
    public Truck(int wheel, boolean engine) {
        super(wheel, engine);
    }

    public void move(){
        System.out.println("The Truck is Moving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,true);
        Rickshaw rickshaw = new Rickshaw(3,false);
        Bus bus = new Bus(4,true);
        Bicycle bicycle = new Bicycle(2,false);
        Truck truck = new Truck(4,true);
        List<Vehicle> list = List.of(car,rickshaw,bus,bicycle,truck);
        for (int i=0; i<list.size(); i++){
            list.get(i).move();
        }



    }
}