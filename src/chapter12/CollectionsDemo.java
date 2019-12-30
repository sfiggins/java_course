package chapter12;


import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args){
        // setDemo();
        // listDemo();
        // queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//        System.out.println(fruit.size()); //4
//        System.out.println(fruit); //[banana, orange, apple, lemon]

        System.out.println("while with iterator:");

        var i = fruit.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        // new for
        System.out.println("advanced for loop");

        for(String item: fruit){
            System.out.println(item);
        }

        System.out.println("for each loop, uses lambda and syntactic sugar:");

        fruit.forEach(System.out::println);
    }

    public static void listDemo(){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(2); //banana
        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]
    }

    public static void queueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]
    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

//        System.out.println(fruitCalories.size()); //4
//        System.out.println(fruitCalories); //{banana=105, orange=45, apple=95, lemon=17}
//
//        System.out.println(fruitCalories.get("lemon")); //17
//
//        System.out.println(fruitCalories.entrySet()); //[banana=105, orange=45, apple=95, lemon=17]
//
//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories);//{banana=105, apple=95, lemon=17}

        for(var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach(
                (k,v) -> System.out.println("Fruit: " + k + ", Calories: " + v)
        );

    }
}
