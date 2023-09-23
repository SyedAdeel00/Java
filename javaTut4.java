import java.util.Scanner;
public class javaTut4 {
    public static void main(String[] args){
        System.out.println("This is my program for calculating the percentage of 5 subjects of a student");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks of subject 1: ");
        int a = sc.nextInt();

        System.out.println("Enter your marks of subject 2: ");
        int b = sc.nextInt();

        System.out.println("Enter your marks of Subject 3: ");
        int c = sc.nextInt();

        System.out.println(" Enter your marks of Subject 4: ");
        int d = sc.nextInt();

        System.out.println("Enter your marks of Subject 5: ");
        int e = sc.nextInt();

        int totalMarks = a + b + c + d + e;

        int maximumMarks = 100 * 5 ;
        
        double percentage = (double) totalMarks / maximumMarks * 100 ;

        System.out.println("Your Percentage = "+ percentage+"%");
        
    }
    
}
