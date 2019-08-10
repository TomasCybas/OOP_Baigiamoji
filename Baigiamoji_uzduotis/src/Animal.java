public abstract class Animal implements Comparable<Animal> {
    private String name;
    private  String type;

    /**
     * Constructor for abstract class Animal
     * @param name name of the Animal
     * @param type type of the Animal
     */
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }


    @Override
    // Compares Animal objects first by their type and then by their name.
    public int compareTo(Animal o) {
        int compareByType = this.type.compareTo(o.type);
        if (compareByType == 0){
            return this.name.compareTo(o.name);
        }else return compareByType;
    }
}
