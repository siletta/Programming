import java.util.Objects;

class Person{
    private String name;

    Person(String name) {
        this.name = name;
    }

    //this have been generated with right click --> generate hashCode() and equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    //this have been generated with right click --> generate hashCode() and equals()
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class App {

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("John");

        System.out.println(person1 == person2); // FALSE

        System.out.println((person1.equals(person2))); //FALSE if I dont override equals() method
        //TRUE if equals() is overrided

        Integer number1 = 6;
        Integer number2 = 6;

        Double double1= 3.4;
        Double double2 = 3.4;

        System.out.println(number1 == number2); // TRUE
        System.out.println(double1 == double2); //FALSE: with Double does not work that's why the .equal() is preferable to ==

        String string1 = "Hello";
        String string2 = "Helloddd".substring(0,5);

        System.out.println(string2);

        System.out.println(string1 == string2);  //FALSE cause for Java compiler string1 and string2 points to different memories area as
        //== checks only if two objects point to the same object
        //.equals() is for comparing in terms of semantic meaning

        System.out.println(string1.equals(string2)); //TRUE as "Hello" is equal to "Hello"

        //ONLY USES
    }


}
