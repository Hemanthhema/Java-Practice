/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/
import java.util.Scanner;
public class DiamondPattern {

//Add main method here
public static void main(String[] args){
//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)
int i, j, k, l, alphabet = 96;
//use for loop and if condition to print a,b,c 
			Scanner sc = new Scanner(System.in);	
		System.out.print("Enter Diamond Pattern of Alphabets Rows = ");
		int rows = sc.nextInt();
		System.out.println("Printing Diamond Alphabets Pattern");
		
		for (i = 1 ; i <= rows; i++ ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");	
			}
			for (k = i ; k >= 1; k-- ) 
			{
				System.out.print((char)(alphabet + k));
			}
			for (l = 2 ; l <= i; l++) 
			{
				System.out.print((char)(alphabet + l));
			}
			System.out.println();
		}
		
		for (i = rows - 1 ; i > 0; i-- ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (k = i ; k >= 1; k-- ) 
			{
				System.out.print((char)(alphabet + k));
			}
			for (l = 2 ; l <= i; l++) 
			{
				System.out.print((char)(alphabet + l));
			}
			System.out.println();
		}
	}
}