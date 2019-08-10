import java.util.LinkedList;

public class AnimalList<T extends Animal> extends LinkedList<T> {

    /**
     * Finds and prints out an Animal by name in the AnimalList;
     * If no such name exists prints out  "Gyvūnas nerastas"
     * @param name  name of the Animal you want to search for
     */
    public void findAnimal(String name){
        int count = 0;
        for (Animal animal : this){
            if (animal.getName().equals(name)){
                System.out.println(animal);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Gyvūnas nerastas");
        }
    }
}
