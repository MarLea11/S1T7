package N1EX2;

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

    @Deprecated
    public int calculateWorkingHoursPerMonth(int hoursWorkedDay) {
        return hoursWorkedDay*30;
    }

    @Deprecated
    public int calculatePriceOilPerYear(int priceOilMonth) {
        return priceOilMonth*12;
    }

    public int getPriceOil() {
        return priceOil;
    }

}