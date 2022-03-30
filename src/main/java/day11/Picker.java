package day11;

public class Picker implements Worker {
    int count = 0;
    private Warehouse warehouse;
    private int salary = 0;
    private boolean bonusTaken = false;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void bonus() {
        if (warehouse.getCountOrders() == 1500 && bonusTaken == false) {
            bonusTaken = true;
            salary = 3 * salary;
        }
    }

    public void doWork() {
        salary += 80;
        count = warehouse.getCountOrders();
        warehouse.setCountOrders(count+1);
    }
}
