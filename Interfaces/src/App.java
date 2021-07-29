public class App {

    public static void main(String[] argc) {
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        Info info1 = new Machine(); //this is possible cause Machine implements Info
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();

        System.out.println();

        outputInfo(info1);
        outputInfo(info2);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
}

