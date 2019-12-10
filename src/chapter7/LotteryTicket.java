package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i< LENGTH; i++){
            int randomNumber;

            /*
             * Generate random number then search to enusure it does
             * not already exist in our area.
             */
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) +1;
            }while(search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        Arrays.sort(ticket);

        return ticket;
    }

    /**
     * Perform a sequential search on an integer array to find a number.
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        //This is called an enhanced loop (a functional each llop?)
        for(int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        /* If we've reached this point, then the entire array was searched
           and the value was not found.
        */
        return false;
    }

    public static void printTicket(int[] ticket){

        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
