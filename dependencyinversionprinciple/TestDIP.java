package dependencyinversionprinciple;

public class TestDIP {
    public static void main(String[] args) {
        Order order = new Order(500);

        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(order, new EWallet());
        processor.processPayment(order, new CreditCard());
        processor.processPayment(order, new Cash());
    }
}
