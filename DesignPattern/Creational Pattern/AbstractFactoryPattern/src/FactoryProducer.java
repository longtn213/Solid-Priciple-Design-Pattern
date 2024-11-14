public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if(factoryType.equals("ELECTRIC")) {
            return new ElectricCarFactory();
        }else if(factoryType.equals("PETROL")) {
            return new PetrolCarFactory();
        }

        return null;
    }
}
