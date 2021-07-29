//UPCASTING is SAFE
//DOWNCASTING is NOT SAFE
class Machine {
    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {

    public void start() {
        System.out.println("Car started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

public class App {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        //Upcasting
        Machine machine2 = camera1; //It is UPcasting as I take camera object and I make it of upper type which is machine
        machine2.start(); //will call the "Car started" method.
        //Indeed: the type on the left will define the methods which can be called (the ones of Machine) but the right one (Camera) will define
        //the implementation of the method to call

        //machine2.snap(); can't do that as Machine has no method snap()

        //Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3;

        camera2.snap();

        Machine machine4 = new Machine();
        Camera camera3 = (Camera) machine4;
        //camera3.start(); //Will generate a class cast machine error when running
        //camera3.snap(); //Will generate a class cast machine error when running
    }

}
