package N1EX1;

public class Worker {

    protected String firstName;
    protected String lastName;

    protected int priceHour;

    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.priceHour = 15;
    }

    public int calculateSalary(int hoursWorked) {
        return priceHour * hoursWorked;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public int getPriceHour() {
        return priceHour;
    }

}
