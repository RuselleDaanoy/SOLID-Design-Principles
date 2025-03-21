package singleresponsibilityprinciple;

public class TestSRP {
    public static void main(String[] args) {
        Pet myPet = new Pet("Summer");
        Owner myOwner = new Owner("Rus");

        System.out.println("Pet Name: " + myPet.getPetName());
        System.out.println("Owner Name: " + myOwner.getOwnerName());
        myPet.makeSound();
    }
}