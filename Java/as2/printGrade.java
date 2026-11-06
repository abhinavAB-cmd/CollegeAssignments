import java.util.*;
public class printGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = sc.nextInt();

        if (score >= 90) 
            System.out.println("Grade: A");
         else if (score >= 75) 
            System.out.println("Grade: B");
         else 
            System.out.println("Grade: C");
        sc.close();
    }
}
