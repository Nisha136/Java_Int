//Task 2: Rock,Paper,Scissors Game
import java.util.Scanner;
import java.util.Random;
public class rps {
    public static void main(String[] args)
    {
        System.out.println("Enter 0 for Rock");
        System.out.println("Enter 1 for Paper");
        System.out.println("Enter 2 for Scissor");
        Scanner scan = new Scanner(System .in);
        System.out.print("Enter your Choice: ");
        int user = scan.nextInt();
        System.out.println("Your choice was: " + user);

        Random r = new Random();
        int computer = r.nextInt(3);
        System.out.println("Computer's choice is: " + computer);
        System.out.println();

        if(user == computer){
            System.out.println("It's a Draw");
        }
        else if(user == 0 && computer == 1){
            System.out.println("Computer won!");
        }
        else if(user == 0 && computer == 2){
            System.out.println("Well played you won!");
        }
        else if(user == 1 && computer == 2){
            System.out.println("Computer won!");
        }
        else if(user == 1 && computer == 0){
            System.out.println("Well played you won!");
        }
        else if(user == 2 && computer == 0){
            System.out.println("Computer won!");
        }
        else if(user == 2 && computer == 1){
            System.out.println("Well played you won!");
        }
        else{
            System.out.println("Oops it's an invalid choice!");
        }
    }
}