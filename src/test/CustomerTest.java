package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        // Створення об'єкта класу Customer
        Customer customer = new Customer();

        // Використання методів встановлення значень
        customer.setID(101);             // Встановлюємо ID
        customer.setStatus(false);       // Встановлюємо статус (не новий клієнт)
        customer.setTotal(999.99);       // Встановлюємо суму покупок

        // Виведення інформації про клієнта
        customer.displayCustomerInfo();
    }
}
