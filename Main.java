public class Main {
    public static void main(String[] args) {
        //declaring the objects
        Bacteria bacteria0 = new Bacteria("Unclassified", 1.89, true);
        Coccus bacteria1 = new Coccus("Streptococcus thermophillus", 0.7, false);
        Bacillus bacteria2 = new Bacillus("Salmonella typhii", 1.5, true);
        Spiral bacteria3 = new Spiral("Shigella dysenteriae", 0.4, false);

        //set the species and print it
        bacteria1.setSpecies("Staphylococcus aureus");
        System.out.println(bacteria1.getSpecies());

        //set the size and print it
        bacteria2.setSize(1.45);
        System.out.println(bacteria2.getSize());

        //set the existence of flagella and print it
        bacteria3.setFlagella(true);
        System.out.println(bacteria3.getFlagella());
        System.out.println(" ");

        //print the information that the bacteria has moved
        bacteria1.move();
        bacteria1.move(3);
        System.out.println(" ");

        //print short description
        bacteria0.shortDescription();
        System.out.println(" ");
        bacteria2.shortDescription();

        //print detailed description
        bacteria1.detailedDescription();
        bacteria2.detailedDescription();
        bacteria3.detailedDescription();

    }
}
