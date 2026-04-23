package java_lecture_6;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada car", "180", 4);
        Boat boat = new Boat("Titanic", "90", "10");
        Bicycle bicycle = new Bicycle("Ukraine", "30", 2);

        System.out.println(lada);
        System.out.println(boat);
        System.out.println(bicycle);

        lada.sayHello();
        boat.sayHello();
        bicycle.sayHello();


        VehicleWithEngine bmw = new Car("BMW", "220", 4);
        ((Car) bmw).increaseCarPower();
    }


}
