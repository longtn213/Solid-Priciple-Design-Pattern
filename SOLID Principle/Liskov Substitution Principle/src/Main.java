public class Main {
    public static void main(String[] args) {

        // design smell
        Vehicle v = new ElectricCar("Ford",6);
        v.speedUp();
        v.slowDown();
        v.fuel();
    }
}