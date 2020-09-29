package animals;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ////////////////////////
        //      VARIABLES     //
        ////////////////////////
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals racoon = new Mammals("Racoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        //////////////////////////
        //      ARRAY LIST      //
        //////////////////////////
        List<AbstractAnimal> animalList = new ArrayList<>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(racoon);
        animalList.add(bigfoot);

        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);

        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        //Prints entire list
        System.out.println(animalList);
        System.out.println();
        System.out.println("\n*** Sort List ***");
        //Sort names alphabetically and log them
        animalList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        animalList.forEach((o) -> System.out.println(o.getName()));

    }
}

//SORT
//  List all the animals in descending order by year named
//  List all the animals alphabetically
//  List all the animals order by how they move
//  List only those animals the breath with lungs
//  List only those animals that breath with lungs and were named in 1758
//  List only those animals that lay eggs and breath with lungs
//  List alphabetically only those animals that were named in 1758
//  For the list of animals, list alphabetically those animals that are mammals.