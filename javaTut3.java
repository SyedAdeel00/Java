import java.util.Scanner;
public class javaTut3{

    public static void main( String[] args){
            System.out.println("Taking User's Input");

            Scanner sc = new Scanner(System.in);
            // sc is just variable name 
            // Scanner means that we want to take User's input
            // (System.in) means taking input by system keyboard 

            System.out.println("Enter First Number: ");
            int a = sc.nextInt();

            System.out.println("Enter second Number: ");
            int b = sc.nextInt();
             
            int c = a + b;
            System.out.println("The sum of Numbers given by User is: " + c); 
    }
}