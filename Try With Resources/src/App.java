class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!") ;
    }
}

public class App {

    public static void main(String[] args) {
        //old way
        Temp temp = new Temp();
        try {
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //since Java 7 we can use Try With Resource (we pass parameter to try)
        try(Temp temp1 = new Temp()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
