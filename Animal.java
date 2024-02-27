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
