public class Main {
    public static void main(String[] args) {

        AbstractFactory factory = FactoryProducer.getFactory("PETROL");
        factory.getCar("FORD").drive();
    }
}