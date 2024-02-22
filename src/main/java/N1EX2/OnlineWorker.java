package N1EX2;

public class OnlineWorker extends Worker {

    private final int priceInternet;

    OnlineWorker(String firstName, String lastName) {
        super(firstName, lastName);
        priceInternet = 100;
    }

    @Override
    public int calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + priceInternet;
    }

    @Deprecated
    public int calculateWorkingHoursPerMonth(int hoursWorkedDay) {
        return hoursWorkedDay*30;
    }

    @Deprecated
    public int calculateInternetPricePerYear(int priceInternetMonth) {
        return priceInternetMonth*12;
    }

    public int getPriceInternet() {
        return priceInternet;
    }

}
