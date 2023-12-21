package Loops;
import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int i;
    do{
        System.out.println("Enter Number:- ");
        i=sc.nextInt();
        System.out.println("Your Number is:- "+i);
    }while(i>=0);
    System.out.println("The End!");
}
}
