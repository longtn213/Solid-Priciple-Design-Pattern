package Employee;

public class CEO implements ChiefExecutiveOfficer {
    @Override
    public void makeDecision() {
        System.out.println("CEO work");
    }

    @Override
    public void addStocks() {
        System.out.println("CEO work");
    }

    @Override
    public void addBonus() {
        System.out.println("CEO work");
    }

    @Override
    public void salary() {
        System.out.println("CEO work");
    }
}
