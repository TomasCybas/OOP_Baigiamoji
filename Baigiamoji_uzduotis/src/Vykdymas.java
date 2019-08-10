import java.util.Collections;

public class Vykdymas {

    public static void main(String[] args) {
        AnimalList<Animal> animalList = new AnimalList<>();
        Hamster keksas  = new Hamster("Keksas");
        keksas.setColor("Balta");
        keksas.setTailLength(2);
        Hamster cika  = new Hamster("Cika");
        cika.setColor("Juoda");
        cika.setTailLength(1);
        Hamster smikis  = new Hamster("Šmikis");
        smikis.setColor("Geltona");
        smikis.setTailLength(3);
        Hamster bonifacas  = new Hamster("Bonifacas");
        bonifacas.setColor("Pilka");
        keksas.setTailLength(4);
        Hamster boratas  = new Hamster("Boratas");
        boratas.setColor("Ruda");
        boratas.setTailLength(4);
        Hamster dzeris  = new Hamster("Džeris");
        dzeris.setColor("Balta");
        dzeris.setTailLength(1);
        Hamster dzeris2  = new Hamster("Džeris");
        dzeris2.setColor("Juoda");
        Fish dranze  = new Fish("Dranzė");
        dranze.setNumberOfFins(20);
        Fish druska  = new Fish("Druska");
        druska.setNumberOfFins(32);
        Fish kruopa  = new Fish("Kruopa");
        kruopa.setNumberOfFins(15);
        Fish melionas  = new Fish("Melionas");
        melionas.setNumberOfFins(10);
        Fish dranze2  = new Fish("Dranzė");
        dranze2.setNumberOfFins(45);
        Fish cika2  = new Fish("Cika");
        cika2.setNumberOfFins(20);
        Fish heliada  = new Fish("Heliada");
        heliada.setNumberOfFins(34);
        Fish gulgis  = new Fish("Gulgis");
        gulgis.setNumberOfFins(26);

        animalList.add(keksas);
        animalList.add(cika);
        animalList.add(smikis);
        animalList.add(bonifacas);
        animalList.add(boratas);
        animalList.add(dzeris);
        animalList.add(dzeris2);
        animalList.add(dranze);
        animalList.add(druska);
        animalList.add(kruopa);
        animalList.add(melionas);
        animalList.add(dranze2);
        animalList.add(cika2);
        animalList.add(heliada);
        animalList.add(gulgis);


        Collections.sort(animalList);
        System.out.println(animalList);
        System.out.println();


        animalList.findAnimal("Džeris");



    }
}
