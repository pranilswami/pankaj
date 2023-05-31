import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int RandomNumber = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("Enter any number between 1 to 10");

        int num = scan.nextInt();
        if(num == RandomNumber)
        {
            System.out.println("Correct! Aren't you lucky.");
            System.out.format("Random number : %d ",RandomNumber);
        }
        else
        {
            System.out.println("Hard luck! Maybe next time.");
            System.out.format("Random number : %d ",RandomNumber);
            int RandomNumber1 = ThreadLocalRandom.current().nextInt(1,10);
            System.out.println("\nEnter any number between 1 to 10");
            int num1 = scan.nextInt();
            if(num1 == RandomNumber1)
            {
                System.out.println("Correct! Aren't you lucky.");
                System.out.format("Random number : %d ",RandomNumber1);
            }
            else
            {
                System.out.println("Hard luck! Maybe next time.");
                System.out.format("Random number : %d ",RandomNumber1);
            }
        }

    }
    
}
