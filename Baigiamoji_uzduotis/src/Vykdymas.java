import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Vykdymas {

    public static void main(String[] args) {
        Hamster a = new Hamster("Antanas");
        Fish b = new Fish("Auksė");
        Fish c = new Fish("Alberta");


        AnimalList<Animal> animalList = new AnimalList<>();
        animalList.add(a);
        animalList.add(b);
        animalList.add(c);
        Collections.sort(animalList);
        System.out.println(animalList);

        animalList.findAnimal("Antanas");



    }
}
