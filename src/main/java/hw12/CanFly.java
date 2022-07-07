package hw12;

public interface CanFly {
    default void canFly() {
        System.out.println(" can fly");
    }
}