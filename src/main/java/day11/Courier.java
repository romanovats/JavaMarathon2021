package day11;

public class Courier {
    int count = 0;
    private Warehouse warehouse;
    private int salary = 0;
    private boolean bonusTaken = false;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void bonus() {
        if (warehouse.getBalance() == 1000000 && bonusTaken == false) {
            bonusTaken = true;
            salary = 2 * salary;
        }
    }

    public void doWork() {
        salary += 100;
        count = warehouse.getBalance();
        warehouse.setBalance(count+1000);
    }
}
