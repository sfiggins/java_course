package chapter10;

public class Banana extends Fruit {

    public Banana() {
        // our bananas are extra big
        setCalories(110);
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made");
    }

    public void removePeel() {
        System.out.println("Removing banana peel");
    }
}
