package singleresponsibilityprinciple;

public class Pet {
    private String petName;

    public Pet(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void makeSound() {
        System.out.println("meow");
    }
}