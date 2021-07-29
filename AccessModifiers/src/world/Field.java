package world;

public class Field {
    private Plant plant1 = new Plant();

    public Field() {
        //size is protected so it can be accessible here from world.Field which is in the same package - src - of world.Plant
        System.out.println(plant1.size);
    }

}
