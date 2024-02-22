package N1EX1;

public class OnsiteWorker extends Worker {

    private int priceOil;

    OnsiteWorker(String firstName, String lastName) {
        super(firstName, lastName);
        priceOil = 50;
    }

    @Override
    public int calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + priceOil;
    }

    public int getPriceOil() {
        return priceOil;
    }

}
