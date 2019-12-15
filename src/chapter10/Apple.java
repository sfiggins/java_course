package chapter10;

public class Apple extends Fruit {
    public Apple() {
        setCalories(95);
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }

    public void removeSeeds() {
        System.out.println("Removing apple seeds");
    }
}
