package chapter13;

public class divideByZeroException {

    public static void main(String[] args){
        try {
            divideByZero();
        }catch (ArithmeticException e) {
            System.out.println("Dividing by zero is not permitted");
            e.printStackTrace();

        }finally{
            System.out.println("Division is fun");
        }
    }

    public static void divideByZero() throws ArithmeticException {
        int c = 30/0;
    }
}
