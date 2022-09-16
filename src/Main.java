import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("------------ Welcome to 'Guess Number' Game! ------------");
        /*
        System generation random number - form 1 to 9
        Then Player have to guess a number
        Player can guess as many times, as he needs
        System will help Player by saying - is number written is larger or smaller generated one
        When player gets number, System will say how many tries you needed to get number
         */
        int count = 0;
        int userNumber;
        int num = (int)Math.floor(Math.random() * 10);
        do {
            Scanner input = new Scanner(System.in);
            count++;
            System.out.println("Enter Your Number");
            try {
                userNumber = input.nextInt();
                if (userNumber > num) {
                    System.out.println("No! Number is lower!");
                } else if (userNumber < num) {
                    System.out.println("No! Number is larger");
                } else {
                    System.out.println("Correct! You Got Number Right! You needed " + count + " times to Guess Number Right!");
                }
            } catch (InputMismatchException e){
                System.out.println("ERROR :( | Please Enter Numbers Next Time!");
                userNumber = -1;
                continue;
            }
        }while (userNumber != num);
    }
}