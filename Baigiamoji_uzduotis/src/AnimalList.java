import java.util.Collection;
import java.util.LinkedList;

public class AnimalList<T extends Animal> extends LinkedList<T> {


    public void findAnimal (String name){
        for (Animal animal : this){
            if (animal.getName().equals(name)){
                System.out.println(animal);
            }
        }
    }
}
