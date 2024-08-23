package factoryPattern;

public class Cat implements Pet {
    private Integer noOfLives;

    public Integer getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
    }

    @Override
    public String prompt() {
        return Integer.toString(getNoOfLives());
    }


}
