public class App {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree1 = new Tree();

        plant1.grow();

        // tree1 = plant1;  WONT WORK: I can't say Plant is a Tree as Plant is its parent so it s generic

        //Plant plant2 = plant1; //TRUE: reference: plant2 references to the same objects plant1

        Plant plant2 = tree1; //WORKS: Bcs of polymorphism I can say that Tree is a Plant as Tree is a subclass of Plant

        plant2.grow(); //THIS will call the Tree growing() method as the plant2 is pointing to Tree object
        //Plant plant3 = new Tree();

        tree1.shedLeaves();

        //plant2.shedLeaves(); //ERROR: the reason is bcs what matters is the type (which is Plant) so plant2 can access only to Plant method

        //plant2 è di tipo Plant. Referenziando a Tree può accedere solo ai metodi di Plant che Tree ha overridato - cioè grow()
        //tuttavia non può accedere ai metodi di Tree che non appartengono a Plant (come shedLeaves)
    }
}
