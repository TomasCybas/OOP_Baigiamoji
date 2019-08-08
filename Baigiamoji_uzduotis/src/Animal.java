public abstract class Animal implements Comparable<Animal> {
    private String name;
    private  String type;


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
    public int compareTo(Animal o) {
        int compareByType = this.type.compareTo(o.type);
        if (compareByType == 0){
            return this.name.compareTo(o.name);
        }else return compareByType;
    }
}
