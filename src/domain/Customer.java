package domain;

public class Customer {
    // Приватні атрибути з початковими значеннями
    private int ID = 0;
    private boolean isNew = true;
    private double total = 0.0;

    // Конструктор за замовчуванням
    public Customer() {
        // Значення вже ініціалізовані при оголошенні
    }

    // Сеттер для ID з перевіркою (ID має бути невід’ємним)
    public void setID(int ID) {
        if (ID >= 0) {
            this.ID = ID;
        } else {
            System.out.println("Error: ID must be non-negative.");
        }
    }

    // Сеттер для статусу клієнта
    public void setStatus(boolean isNew) {
        this.isNew = isNew;
    }

    // Сеттер для total з перевіркою (total не може бути від’ємним)
    public void setTotal(double total) {
        if (total >= 0) {
            this.total = total;
        } else {
            System.out.println("Error: Total must be non-negative.");
        }
    }

    // Метод для виведення інформації про клієнта
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is new customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
