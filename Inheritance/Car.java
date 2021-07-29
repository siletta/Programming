package Inheritance;

public class Car extends Machine{
    public void wipeWindShield() {
        System.out.println("Wiping windshields");
    }

    //overriding - specializing - the mother's method
    public void start() {
        System.out.println("Car started");
    }

    //overriding - specializing - the mother's method
    public void stop() {
        System.out.println("Car stopped");
    }

    public void showName() {
        // System.out.println(name);  DOES NOT WORK AS WE CAN'T ACCESS TO PRIVATE name VARIABLE
    }

    public void showModel() {
        System.out.println(model); //IT WORKS AS model HAS CLASS VISIBILITY
    }


}
