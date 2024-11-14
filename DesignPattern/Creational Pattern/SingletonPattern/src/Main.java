public class Main {
    public static void main(String[] args) {

//        DatabaseConnector ob1 = DatabaseConnector.getInstance();
//        DatabaseConnector ob2 = DatabaseConnector.getInstance();

        Database ob1 = Database.INSTANCE;
        Database ob2 = Database.INSTANCE;

        if( ob1 == ob2 ){
            System.out.println("the Objects are the same");
        }

    }
}