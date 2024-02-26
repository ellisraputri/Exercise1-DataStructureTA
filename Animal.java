public class Animal {
    //animal attributes
    private static final String Nucleus = "Eukaryotes";
    private String species;
    private double size;     //in cm
    private boolean existenceOfWing;


    //parent class constructor
    public Animal(String species, double size, boolean existenceOfWing){
        this.species = species;
        this.size = size;
        this.existenceOfWing = existenceOfWing;
    }


    //setter for species
    public void setSpecies(String species){
        this.species = species;
    }

    //getter for species
    public String getSpecies(){
        return this.species;
    }

   //setter for size
    public void setSize(double size){
        this.size = size;
    }

    //getter for size
    public double getSize(){
        return this.size;
    }

    //setter for wing existence
    public void setWing(boolean existenceOfWing){
        this.existenceOfWing = existenceOfWing;
    }

    //getter for wing existence
    public boolean getWing(){
        return this.existenceOfWing;
    }


    //overloading the move() function
    public void move(){
        System.out.println(this.species + " has moved 1 m.");
    }
    public void move(int movement){
        System.out.println(this.species + " has moved " + movement + " m.");
    }

    //get wing description
    private String wingDescription(){
        if(this.existenceOfWing){
            return "Yes";
        }
        else{
            return "No";
        }
    }

    //print short description for animal
    public void shortDescription(){
        System.out.println("Type: "+ Nucleus);
        System.out.println("Species: "+ this.species);
        System.out.println("Size: "+ this.size);
        System.out.println("Wing existence: "+ this.wingDescription());
    }

}


//first child class
class Mammal extends Animal{
    //attribute
    private String character = "have hair";

    //child class constructor
    public Mammal(String species, double size, boolean existenceOfWing) {
        super(species, size, existenceOfWing);
    }

    //print short description
    public void shortDescription(){
        super.shortDescription();
        System.out.println("Unique characteristic: "+ this.character + "\n");
    }

    //print detailed description
    public void detailedDescription(){
        System.out.println("-----------------------------");
        System.out.println("MAMMAL DESCRIPTION");
        this.shortDescription();
        System.out.println("This kind of animal have their body covered with hair.");
        System.out.println("They also have mammary glands.");
        System.out.println("All of them are warm-blooded." + "\n");
    }
}


//second child class
class Insecta extends Animal{
    //attributes
    private String character = "have 6 legs";

    //child class constructor
    public Insecta(String species, double size, boolean existenceOfWing) {
        super(species, size, existenceOfWing);
    }

    //print short description
    public void shortDescription(){
        super.shortDescription();
        System.out.println("Unique characteristic: "+ this.character + "\n");
    }

    //print detailed description
    public void detailedDescription(){
        System.out.println("-----------------------------");
        System.out.println("INSECTA DESCRIPTION");
        this.shortDescription();
        System.out.println("This kind of animal is a type of Invertebrates.");
        System.out.println("Their bodies divides as three parts: head, abdomen, and thorax.");
        System.out.println("They usually have 2 compound eyes." + "\n");
    }
}


//third child class
class Aves extends Animal{
    //attribute
    private String character = "have feathers";

    //child class constructor
    public Aves(String species, double size, boolean existenceOfWing) {
        super(species, size, existenceOfWing);
    }

    //print short description
    public void shortDescription(){
        super.shortDescription();
        System.out.println("Unique characteristic: "+ this.character + "\n");
    }

    //print detailed description
    public void detailedDescription(){
        System.out.println("-----------------------------");
        System.out.println("AVES DESCRIPTION");
        this.shortDescription();
        System.out.println("Aves, also known as the birds species.");
        System.out.println("They are warm-blooded and have feathers.");
        System.out.println("They have four-chambered hearts and strong skeleton." + "\n");
    }
}


