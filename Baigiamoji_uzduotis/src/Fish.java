public class Fish extends Animal {
    private int numberOfFins;


    /**
     * Constructor for Animal SubClass Fish
     * @param name name of the Fish
     */
    public Fish(String name) {
        super(name, "Žuvis");
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    @Override
    public String toString() {
        return this.getType() + "." + " Vardas: " + this.getName() + "," + " Pelekų kiekis: " +
                this.getNumberOfFins() + "." + "\n";
    }
}
