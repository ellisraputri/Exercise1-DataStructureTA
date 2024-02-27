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