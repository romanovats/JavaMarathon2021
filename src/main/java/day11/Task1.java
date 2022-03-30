package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        for (int i=1; i<=1500; i++) {
            picker1.doWork();
            courier1.doWork();
            picker1.bonus();
            courier1.bonus();
        }
        System.out.println("Баланс на первом складе: " + warehouse1.getBalance() + "\nКол-во заказов на первом складе: " + warehouse1.getCountOrders()
        + "\nЗарплата курьера на первом складе: " + courier1.getSalary() + "\nЗарплата сборщика на первом складе: " + picker1.getSalary());

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        picker2.doWork();
        courier2.doWork();
        System.out.println("\nБаланс на втором складе: " + warehouse2.getBalance() + "\nКол-во заказов на втором складе: " + warehouse2.getCountOrders()
                + "\nЗарплата курьера на втором складе: " + courier2.getSalary() + "\nЗарплата втором на первом складе: " + picker2.getSalary());
        System.out.println("\nБаланс на первом складе: " + warehouse1.getBalance() + "\nКол-во заказов на первом складе: " + warehouse1.getCountOrders()
                + "\nЗарплата курьера на первом складе: " + courier1.getSalary() + "\nЗарплата сборщика на первом складе: " + picker1.getSalary());

    }
}
