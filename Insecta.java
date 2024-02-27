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


 