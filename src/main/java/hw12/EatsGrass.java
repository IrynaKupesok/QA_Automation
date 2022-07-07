package hw12;

public interface EatsGrass {
    default void eatsGrass() {
        System.out.println(" eats grass");
    }
}