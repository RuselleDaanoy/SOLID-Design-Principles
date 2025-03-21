package dependencyinversionprinciple;

public class EWallet implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using E-Wallet.");
    }
}
