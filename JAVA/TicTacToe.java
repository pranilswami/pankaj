
import java.text.BreakIterator;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input;
        char turn = 'X';
        char[] pos = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
        int currentturn=0;

        System.out.print("\033[H\033[2J");//Clear the screen
        System.out.flush();

        System.out.println(" "+pos[0]+" | "+pos[1]+" | "+pos[2]+" ");
        System.out.println("---+---+---");
        System.out.println(" "+pos[3]+" | "+pos[4]+" | "+pos[5]+" ");
        System.out.println("---+---+---");
        System.out.println(" "+pos[6]+" | "+pos[7]+" | "+pos[8]+" ");

        while(true){
        
        do{
            System.out.print("\nEnter a position : ");  
            input = scan.nextInt();
        }while((pos[input-1]=='X')||(pos[input-1]=='O'));

        System.out.print("\033[H\033[2J");//Clear the screen
        System.out.flush();

        // DISPLAY 
        pos[input-1] = turn;
        System.out.println(" "+pos[0]+" | "+pos[1]+" | "+pos[2]+" ");
        System.out.println("---+---+---");
        System.out.println(" "+pos[3]+" | "+pos[4]+" | "+pos[5]+" ");
        System.out.println("---+---+---");
        System.out.println(" "+pos[6]+" | "+pos[7]+" | "+pos[8]+" ");

        // WINNING CONDITION
        if((pos[0]==turn && pos[1]==turn && pos[2]==turn)
          ||(pos[3]==turn && pos[4]==turn && pos[5]==turn)
          ||(pos[6]==turn && pos[7]==turn && pos[8]==turn)
          ||(pos[0]==turn && pos[3]==turn && pos[6]==turn)
          ||(pos[1]==turn && pos[4]==turn && pos[7]==turn)
          ||(pos[2]==turn && pos[5]==turn && pos[8]==turn)
          ||(pos[0]==turn && pos[4]==turn && pos[8]==turn)
          ||(pos[2]==turn && pos[4]==turn && pos[6]==turn))
          {
                System.out.println("\n"+turn + " is the WINNER");
                break;
          }

        // ALTERNATE TURN
        if(turn == 'X')
            turn = 'O';
        else if(turn == 'O')
            turn = 'X';

        currentturn++;
        // CHECK FOR DRAW
        if(currentturn>=9){
            System.out.println("\nDRAW");
            break;
        }

        }    
    }
}
