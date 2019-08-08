public class Hamster extends Animal {
    private int tailLength;
    private String color;


    public Hamster(String name) {
        super(name, "Žiurkėnas");



    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return this.getType() + "." + " Vardas: " + this.getName() + "," + " Uodegos ilgis: " + this.getTailLength() +
                " cm," + " Spalva: " + this.getColor() + "." + "\n";
    }
}
