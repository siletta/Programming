import world.Plant;

public class Grass extends Plant{

    public Grass(){
        //height is protected
        //System.out.println(this.height); WONT WORK as Grass is not in the same package as Plant even though being its child (subclass)
    }

}
