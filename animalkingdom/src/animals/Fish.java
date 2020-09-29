package animals;

public class Fish extends AbstractAnimal {

    public Fish (String name, int yearNamed, int id){
        super(name, yearNamed, id);
    }

    @Override
    public String getMovement(){
        return "Swim";
    }
    @Override
    public String getBreath(){
        return  "Gills";
    }
    @Override
    public String getReproduction(){
        return "Eggs";
    }
    @Override
    public String toString(){
        return "Fish Name: " + name + " Year Named: " + yearNamed;
    }
    @Override 
    public String getName(){
        return name;
    }

}