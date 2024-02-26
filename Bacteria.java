public class Bacteria {
    //bacteria attributes
    private static final String Nucleus = "None";
    private String species;
    private double size;
    private boolean existenceOfFlagella;


    //parent class constructor
    public Bacteria(String species, double size, boolean existenceOfFlagella){
        this.species = species;
        this.size = size;
        this.existenceOfFlagella = existenceOfFlagella;
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

    //setter for flagella existence
    public void setFlagella(boolean existenceOfFlagella){
        this.existenceOfFlagella = existenceOfFlagella;
    }

    //getter for flagella existence
    public boolean getFlagella(){
        return this.existenceOfFlagella;
    }


    //overloading the move() function
    public void move(){
        System.out.println(this.species + " has moved 1 mm.");
    }
    public void move(int movement){
        System.out.println(this.species + " has moved " + movement + " mm.");
    }


    //print short description for bacteria
    public void shortDescription(){
        System.out.println("Nucleus existence: "+ Nucleus);
        System.out.println("Species: "+ this.species);
        System.out.println("Size: "+ this.size);
        System.out.println("Flagella existence: "+ this.existenceOfFlagella);
    }

}


//first child class
class Coccus extends Bacteria{
    //attribute
    private String shape = "sphere";

    //child class constructor
    public Coccus(String species, double size, boolean existenceOfFlagella) {
        super(species, size, existenceOfFlagella);
    }

    //print short description
    public void shortDescription(){
        super.shortDescription();
        System.out.println("Bacteria shape: "+ shape + "\n");
    }

    //print detailed description
    public void detailedDescription(){
        this.shortDescription();
        System.out.println("This kind of bacteria is called coccus and a group of them is called cocci.");
        System.out.println("Classification: Diplococci, Streptococci, Staphylococci, Tetrads, and Sarcina.");
        System.out.println("An example of this class is Streptococcus pneumoniae that causes pneumonia." + "\n");
    }
}


//second child class
class Bacillus extends Bacteria{
    //attributes
    private String shape = "rod";

    //child class constructor
    public Bacillus(String species, double size, boolean existenceOfFlagella) {
        super(species, size, existenceOfFlagella);
    }

    //print short description
    public void shortDescription(){
        super.shortDescription();
        System.out.println("Bacteria shape: "+shape + "\n");
    }

    //print detailed description
    public void detailedDescription(){
        this.shortDescription();
        System.out.println("This kind of bacteria is called bacillus and a group of them is called bacilli.");
        System.out.println("Classification: Diplobacilli, Streptobacilli, and Coccobacillus.");
        System.out.println("An example of this class is Eschericia coli that exists in our large instentine." + "\n");
    }
}


//third child class
class Spiral extends Bacteria{
    //attribute
    private String shape = "round";

    //child class constructor
    public Spiral(String species, double size, boolean existenceOfFlagella) {
        super(species, size, existenceOfFlagella);
    }

    //print short description
    public void shortDescription(){
        super.shortDescription();
        System.out.println("Bacteria shape: "+shape + "\n");
    }

    //print detailed description
    public void detailedDescription(){
        this.shortDescription();
        System.out.print("This kind of bacteria divided into the Spirillum and Spirochetes.");
        System.out.println("Spirillum is very rigid, while Spirochetes is more flexible.");
        System.out.println("An example of this class is Helicobacter pylori that causes peptic ulcer." + "\n");
    }
}


