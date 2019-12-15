package chapter11;

public class Farm {

    public static void main(String[] args){
        Animal pig = new Pig();
        pokeAnimal(pig);
        feedAnimal(pig);

        Animal duck = new Duck();
        pokeAnimal(duck);
        feedAnimal(duck);
    }

    private static void pokeAnimal(Animal animal){
        animal.makeSound();
    }

    private static void feedAnimal(Animal animal){
        animal.eat();
    }

}
