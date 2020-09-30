package animals;
import java.util.List;
import java.util.ArrayList;

public class Main {

    private static List<AbstractAnimal> filterAnimals(List<AbstractAnimal> animals, CheckAnimals tester)
    {
        List<AbstractAnimal> tempList = new ArrayList<>();
        for (AbstractAnimal a : animals){
            if (tester.test(a)){
                tempList.add(a);
            }
        }
        return tempList;
    }
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

        System.out.println("\n*** MVP ***");
        System.out.println("List all the animals in descending order by year named");
        animalList.sort((o1, o2) -> o2.getYearNamed() - o1.getYearNamed());
        animalList.forEach((o) -> System.out.println(o.getName() + " " + o.getReproduction() + " " + o.getMovement() + " " + o.getBreath() + " " + o.getYearNamed()));
        System.out.println();

        System.out.println("List all the animals alphabetically");
        animalList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        animalList.forEach((o) -> System.out.println(o.getName() + " " + o.getReproduction() + " " + o.getMovement() + " " + o.getBreath() + " " + o.getYearNamed()));
        System.out.println();

        System.out.println("List all the animals order by how they move");
        animalList.sort((o1, o2) -> o1.getMovement().compareToIgnoreCase(o2.getMovement()));
        animalList.forEach((o) -> System.out.println(o.getName() + " " + o.getReproduction() + " " + o.getMovement() + " " + o.getBreath() + " " + o.getYearNamed()));
        System.out.println();

        System.out.println("List only those animals the breathe with lungs");
        List<AbstractAnimal> lungList = filterAnimals(animalList, a -> a.getBreath().equals("Lungs"));
        lungList.forEach((o) -> System.out.println(o.getName() + " " + o.getReproduction() + " " + o.getMovement() + " " + o.getBreath() + " " + o.getYearNamed()));
        System.out.println();

        System.out.println("List only those animals that breath with lungs and were named in 1758");
        List<AbstractAnimal> yearlungList = filterAnimals(animalList, a -> (a.getBreath().equals("Lungs")) && (a.getYearNamed() == 1758));
        yearlungList.forEach((o) -> System.out.println(o.getName() + " " + o.getReproduction() + " " + o.getMovement() + " " + o.getBreath() + " " + o.getYearNamed()));
        System.out.println();

        System.out.println("List only those animals that lay eggs and breathe with lungs");
        List<AbstractAnimal> egglungList = filterAnimals(animalList, a -> (a.getBreath().equals("Lungs")) && (a.getReproduction().equals("Eggs")));
        egglungList.forEach((o) -> System.out.println(o.getName() + " " + o.getReproduction() + " " + o.getMovement() + " " + o.getBreath() + " " + o.getYearNamed()));
        System.out.println();

        System.out.println("List alphabetically only those animals that were named in 1758");
        List<AbstractAnimal> yearList = filterAnimals(animalList, a -> a.getYearNamed() == 1758);
        yearList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        yearList.forEach((o) -> System.out.println(o.getName() + " " + o.getReproduction() + " " + o.getMovement() + " " + o.getBreath() + " " + o.getYearNamed()));
        System.out.println();

        System.out.println("\n*** Stretch ***");
        System.out.println("For the list of animals, list alphabetically those animals that are mammals.");
        List<AbstractAnimal> mammal = filterAnimals(animalList, a -> a.getMovement().equals("Walk"));
        mammal.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        mammal.forEach((o) -> System.out.println(o.getName() + " " + o.getReproduction() + " " + o.getMovement() + " " + o.getBreath() + " " + o.getYearNamed()));
        System.out.println();
    }
}
