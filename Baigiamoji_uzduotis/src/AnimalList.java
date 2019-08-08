import java.util.Collection;
import java.util.LinkedList;

public class AnimalList<T extends Animal> extends LinkedList<T> {


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
