import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Vykdymas {

    public static void main(String[] args) {
        AnimalList<Animal> animalList = new AnimalList<>();
        animalList.add(new Hamster("Keksas"));
        animalList.add(new Hamster("Cika"));
        animalList.add(new Hamster("Šmikis"));
        animalList.add(new Hamster("Bonifacas"));
        animalList.add(new Hamster("Boratas"));
        animalList.add(new Hamster("Džeris"));
        animalList.add(new Hamster("Džeris"));
        animalList.add(new Fish("Dranzė"));
        animalList.add(new Fish("Druska"));
        animalList.add(new Fish("Kruopa"));
        animalList.add(new Fish("Melionas"));
        animalList.add(new Fish("Dranzė"));
        animalList.add(new Fish("Cika"));
        animalList.add(new Fish("Heliada"));
        animalList.add(new Fish("Gulgis"));

        Collections.sort(animalList);
        System.out.println(animalList);
        System.out.println();


        animalList.findAnimal("Džeris");



    }
}
