public class Main {
    public static void main(String[] args) {
        //declaring the objects
        Animal animal0 = new Animal("Unclassified", 1.89, true);
        Mammal animal1 = new Mammal("Ele", 370.7, false);
        Insecta animal2 = new Insecta("Butterfly", 7.1, true);
        Aves animal3 = new Aves("Chicken", 84, false);

        //set the species and print it
        animal1.setSpecies("Elephant");
        System.out.println(animal1.getSpecies());

        //set the size and print it
        animal2.setSize(6.45);
        System.out.println(animal2.getSize());

        //set the existence of flagella and print it
        animal3.setWing(true);
        System.out.println(animal3.getWing());
        System.out.println(" ");

        //print the information that the animal has moved
        animal1.move();
        animal1.move(3);
        System.out.println(" ");

        //print short description
        animal0.shortDescription();
        System.out.println(" ");
        animal2.shortDescription();

        //print detailed description
        animal1.detailedDescription();
        animal2.detailedDescription();
        animal3.detailedDescription();

    }
}
