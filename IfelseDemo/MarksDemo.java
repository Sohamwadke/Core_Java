package IfelseDemo;

import java.util.Scanner;

public class MarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks=sc.nextInt();
        if(marks>=70)
        {
            System.out.println("Gradeo");
        }
        else if (marks<70&& marks >60)
        {
            System.out.println("Grade a");  
        
        }
        else if(marks<60 && marks >50)
        {
            System.out.println("Grade b")
        }
        else if(marks<50 && marks >40)
        {
            System.out.println(:Grade c);
        }
    }   else
}
