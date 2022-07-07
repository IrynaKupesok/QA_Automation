package hw12;

public class Platypus extends Bird implements CanSwim, CanFly, EatsBugs {


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        RubberDuck duck1 = new RubberDuck();
        Martin martin1 = new Martin();
        Platypus platypus1 = new Platypus();
        Swan swan1 = new Swan();
    }
}