package N1EX1;

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

    public int getPriceInternet() {
        return priceInternet;
    }

}
