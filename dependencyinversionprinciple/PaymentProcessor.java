package dependencyinversionprinciple;

public class PaymentProcessor {
    public void processPayment(Order order, PaymentMethod paymentMethod) {
        paymentMethod.pay(order.getAmount());
    }
}

