/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

//main method
public static void main(String[] args){
  

 // Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
   int a,b;

 // Take input from user
  System.out.println("Enter a,b values ");
   a=sc.nextInt();
   b=sc.nextInt();
 int i=a-b;
int j=a*b;
int k =a/b;
int l=a+1;
int p=b-1;
int m=(a%b);

  System.out.println("Difference=" +i);
  System.out.println("mul="+j);
  System.out.println("Div="+k);
  System.out.println("inc="+l);
  System.out.println("resl="+m);
  System.out.println("dec="+p);




//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

}
}