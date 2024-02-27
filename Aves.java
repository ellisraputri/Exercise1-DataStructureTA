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
