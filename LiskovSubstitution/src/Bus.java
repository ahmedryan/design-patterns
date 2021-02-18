public class Bus extends Vehicle{
    @Override
    void getSpeed() {
        System.out.println("Bus Speed");
    }

    @Override
    void getCubicCapacity() {
        System.out.println("Bus CC");
    }

    void getEmergencyExitLock() {
        System.out.println("Bus Emergency Lock");
    }
}
