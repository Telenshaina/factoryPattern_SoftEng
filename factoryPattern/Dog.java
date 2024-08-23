package factoryPattern;

public class Dog implements Pet {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String prompt() {
        return getBreed();
    }

   
}
