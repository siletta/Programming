package world;

public class Oak extends Plant{

    public Oak() {
        //type = "tree";  --> WONT WORK AS type IS PRIVATE

        this.size = "large"; //this will work as size is protected so it can be accessible within same package and within each child class
        //as world.Oak is a subclass of world.Plant

        //no access specifier for height so it works cause Oak and Plants are in the same package
        this.height = 10;
    }
}
