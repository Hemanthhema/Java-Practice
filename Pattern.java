/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

public class Pattern {
     
//Add main method here
public static void main(String[] args){
  

//Declare variable n and initialize value as 5
int n=5;
//Check whether the i and j are equal or not using for loop
   for(int i=1;i<=n;i++){ //12345
    for(int j=1;j<=i;j++){ //12
    

    if(j%2==0) { //f
      System.out.print("0");
    }
      else{
      System.out.print("1");
      }
    }
     System.out.println();
   }
  
}
//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero
}

