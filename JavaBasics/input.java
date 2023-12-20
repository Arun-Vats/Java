import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:-");
        int age=sc.nextInt(); //to take integer datatype input
        System.out.println("Your age is "+age);
        System.out.println("Please Enter Your Name:-");
        String name=sc.next();   //to take String datatype input
        System.out.println("Your name is "+name);
        System.out.println("Enter Your Surname:- ");
    }
}
