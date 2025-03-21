package opencloseprinciple;

public class TestOCP {
    public static void main(String[] args) {
        try {
            Customer student = new Customer("Alice", new StudentDiscount());
            Customer senior = new Customer("Bob", new SeniorDiscount());
            Customer regular = new Customer("Charlie", new RegularDiscount());

            System.out.println("Student's discounted amount: " + student.applyDiscount(1000));
            System.out.println("Senior Citizen's discounted amount: " + senior.applyDiscount(1000));
            System.out.println("Regular customer's discounted amount: " + regular.applyDiscount(1000));

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}