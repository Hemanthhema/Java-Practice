import java.util.Scanner;
public class Evenoddarray
{
    public static void main(String[] args)
    {
        int s,counte=0,counto=0;
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter size  ");
        s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter elements  ");
        for(int i = 0; i < s; i++) 
        {
            arr[i] = sc.nextInt();
        }
        // print odd numbers
        System.out.print("Odd numbers : ");
        for(int i = 0 ; i < s ; i++)
        {
            if(arr[i] % 2 != 0)
            {
              counte++;
                System.out.print(arr[i] + " ");
            }
        }
         System.out.println("count="+counte);
        System.out.println("");
        // print even numbers
        System.out.print("Even numbers : ");
        for(int i = 0 ; i < s ; i++)
        {
            if(arr[i] % 2 == 0)
            {
              counto++;
                System.out.print(arr[i] + " ");
            }
        }
      System.out.println("count="+counto);
        
    }
}