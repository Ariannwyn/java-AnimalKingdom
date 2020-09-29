package animals;

abstract class AbstractAnimal{
    protected int id;
    protected String name;
    protected int yearNamed;

    public AbstractAnimal(String name, int yearNamed, int id){
        this.name = name;
        this.yearNamed = yearNamed;
        this.id = id;
    }

    //Abstract Methods
    abstract String getMovement();
    abstract String getBreath();
    abstract String getReproduction();

    String getName(){
        return name;
    }

    int getYearNamed(){
        return yearNamed;
    }
}

//METHODS
// Methods will return a string saying how that animal implements the action
// All animals can move, breath, reproduce. How they do that varies by animal type.
// Mammals move - walk, breath - lungs, reproduce - live births
// Birds move - fly, breath - lungs, reproduce - eggs
// Fish move - swim, breath - gills, reproduce - eggs

//CHILD CLASS
// Create classes for mammals, birds, fish
// Hint: think about abstract classes and creating an ArrayList using an 
// abstract class type.
