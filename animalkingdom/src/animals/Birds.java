package animals;

public class Birds extends AbstractAnimal {

    public Birds (String name, int yearNamed){
        super(name, yearNamed);
    }

    @Override
    public String getMovement(){
        return "Fly";
    }
    @Override
    public String getBreath(){
        return  "Lungs";
    }
    @Override
    public String getReproduction(){
        return "Eggs";
    }
    @Override
    public String toString(){
        return "Bird Name: " + name + " Year Named: " + yearNamed;
    }
    @Override 
    public String getName(){
        return name;
    }

}