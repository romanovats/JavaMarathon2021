package day11;

public class Warehouse {
    private int countOrder;
    private int balance;

    public void setCountOrders(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCountOrders() {
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
