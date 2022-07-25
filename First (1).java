import java.util.Scanner;
public class First {

     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.next().toLowerCase();
        System.out.print("Enter a character to count in [" + str + "] : ");
        char chr = sc.next(".").toLowerCase().charAt(0); 
        int count = 0;
        for (char c : str.toCharArray()) {
            if (chr == c) {
                count++;
            }
        }
        System.out.println("\n"+ chr + " occurs " + count + " times in " + str);
    }
}