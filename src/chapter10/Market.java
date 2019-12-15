package chapter10;

public class Market {

    public static void main(String[] args){
        Fruit shiny = new Apple();
        System.out.println(String.format("Our apples have %d calories.", shiny.getCalories()));
        squeeze(shiny);

        Fruit plump = new Banana();
        System.out.println(String.format("Our bananas have %d calories.", plump.getCalories()));
        squeeze(plump);

    }

    public static void squeeze(Fruit fruit) {
        if(fruit instanceof Apple) {
            ((Apple) fruit).removeSeeds();
        }
        else if(fruit instanceof Banana) {
            ((Banana) fruit).removePeel();
        }

        System.out.println(String.format("Juicing %d calories", fruit.getCalories()));
        fruit.makeJuice();
    }
}
