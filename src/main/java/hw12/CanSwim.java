package hw12;

public interface CanSwim {
    default void canSwim() {
        System.out.println(", can swim");
    }
}