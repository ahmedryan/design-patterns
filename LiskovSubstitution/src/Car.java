public class Car extends Vehicle{

    @Override
    void getSpeed() {
        System.out.println("Car Speed");
    }

    @Override
    void getCubicCapacity() {
        System.out.println("Car CC");
    }

    void autoDrive() {
        System.out.println("Car AutoDrive");
    }
}
