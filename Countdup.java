import java.util.*;  
class Countdup {  
    public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int count=0;
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("enter  array elements" );
      for(int i=0; i<n; i++) {
         arr[i] = sc.nextInt();
     }
      for(int i=0; i<n-1; i++) {
       
          if(arr[i]==arr[i+1]){
            count++;
          //  System.out.println(arr[i] +" is duplicate number");
      System.out.println(count);
          }
          
    
          }
        }
 }