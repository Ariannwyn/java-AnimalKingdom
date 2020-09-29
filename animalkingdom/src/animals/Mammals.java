package animals;

public class Mammals extends AbstractAnimal {

    public Mammals (String name, int yearNamed, int id){
        super(name, yearNamed, id);
    }

    @Override
    public String getMovement(){
        return "Walk";
    }
    @Override
    public String getBreath(){
        return  "Lungs";
    }
    @Override
    public String getReproduction(){
        return "Live births";
    }
    @Override
    public String toString(){
        return "Mammals Name: " + name + " Year Named: " + yearNamed;
    }
    @Override 
    public String getName(){
        return name;
    }

}