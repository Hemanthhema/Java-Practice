//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
public class Percentage {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your scored marks");
     int scored; 
      scored= sc.nextInt();
     System.out.println("Enter total marks");
    int total=sc.nextInt();
    int percentage=scored/total;   System.out.println("percentage="+percentage +"%");      
   }
}
/*=======
import java.util.Scanner;
 class Percentage {
   public static void main(String args[]){
      double percentage;
       long total_marks;
      long scored;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your marks ");
      scored = sc.nextInt();

      System.out.println("Enter total marks ");
      total_marks = sc.nextInt();

      percentage =((scored/total_marks)*100);
      System.out.println("Percentage="+percentage);
   }
}


// Kindly check the formula for percentage and redo it, work on the indentation and keep appropriate comments in the code.
>>>>>>> c12cde90bce45abf75185047e3d4b4500070a66d
  */
// Kindly work on the indentation and keep appropriate comments in the code.
//Good Job!
//Please push your assignment to github. If you have pused it, forget this comment.