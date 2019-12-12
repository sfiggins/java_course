package chapter9;

public class TasteTester {

    public static void main(String[] args){
        Cake basicCake = new Cake("Strawberry");
        basicCake.setPrice(4.54);

        BirthdayCake bdayCake = new BirthdayCake();
        bdayCake.setCandles(54);
        bdayCake.setPrice(10.0);

        WeddingCake wedCake = new WeddingCake();
        wedCake.setPrice(1000.0);
        wedCake.setTiers(5);

        System.out.println(String.format("Basic cake flavor is %s and costs %.2f", basicCake.getFlavor(), basicCake.getPrice()));
        System.out.println(String.format("Birthday cake flavor is %s and costs %.2f", bdayCake.getFlavor(), bdayCake.getPrice()));
        System.out.println(String.format("Wedding cake flavor is %s and costs %.2f", wedCake.getFlavor(), wedCake.getPrice()));

    }
}
