import world.Plant;

public class App {

    public static void main(String[] args){
        Plant plant1 = new Plant();
        //plant1.name -->Bad practice: you should not declare instance variables as public
        System.out.println(plant1.ID);

        //System.out.println(plant1.type); //wont work as type is private
        //System.out.println(plant1.size); --> wont work as size is protected but App is not in the same package of Plant

        //System.out.println(plant1.height); Wont work cause Plant and App are at different packages and height has Package visibility
    }


}
