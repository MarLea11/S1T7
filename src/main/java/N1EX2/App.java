package N1EX2;

@SuppressWarnings("deprecated")

public class App {

    private App(){}

    public static void runProgram(){

        Worker worker1 = new Worker("Ezequiel", "Gonzalez");
        OnlineWorker worker2 = new OnlineWorker("James", "Rodriguez");
        OnsiteWorker worker3 = new OnsiteWorker("Raul", "Perez");

        System.out.println("Worker Salary: " + worker1.calculateSalary(20));
        System.out.println("Online Worker Salary: " + worker2.calculateSalary(10));
        System.out.println("On-site Worker Salary: " + worker3.calculateSalary(30));

        // Deprecated methods of the child classes
        worker2.calculateInternetPricePerYear(100);
        worker3.calculatePriceOilPerYear(50);

    }

}