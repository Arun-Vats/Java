//Guess the number between 0 to 100 game.
import java.util.Scanner;
public class miniproject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rn=(int)(Math.random()*100);
        int un=0;
        do{
           System.out.println("Guess Number Between 0 to 100 :- ");
           un=sc.nextInt();
           if(un==rn){
            System.out.println("Yeah! You guessed it right.");
            break;
           }
           else if(un>rn){
            System.out.println("guessed number is larger.");
           }
           else{
            System.out.println("Guessed number is smaller.");
           }
        }while(un>=0);

        System.out.println("The Number was:- "+rn);
        
    }
}
