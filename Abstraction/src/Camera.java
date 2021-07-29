public class Camera extends Machine{
    @Override
    public void start() {
        System.out.println("Camera started");
    }

    @Override
    public void doStuff() {
        System.out.println("Camera doStuff");
    }

    @Override
    public void shutDown() {
        System.out.println("Camera shutDown");
    }
}
