
// COMPUTER WILL GUESS THE NUMBER YOU ENTER BETWEEN 1 TO 100
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class java3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Computer Will Guess : \nEnter 'higher' if computer goes too low and enter 'lower' if computer goes too high\n\n");
        System.out.println("Start the Game : \n");
        System.out.print("Enter Your Number: ");
        int User_Number = scan.nextInt();
        int RandomNumber=0,low=1,high=101;
        String help="p";
        do
        {
            RandomNumber = ThreadLocalRandom.current().nextInt(low,high);
            System.out.println("\nIs this your number : "+RandomNumber);
            if(RandomNumber>User_Number)
            {
                high = RandomNumber;
            }
            else if(RandomNumber<User_Number)
            {
                low = RandomNumber;
                
            }
            System.out.print("Help : ");
            help = scan.next();
        }while(!help.equals("correct"));

        System.out.println("\nThank You for helping me!!!");
    }
}
