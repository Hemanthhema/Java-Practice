import java.util.Scanner;
class Reverseanum {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    
    int num , rev = 0;
    System.out.println("enter a number");
    num=sc.nextInt();
    while(num != 0) {  //456 45
      int d = num % 10; //6 5
      rev = rev * 10 + d; //65
      num=num/10; //45
    }

    System.out.println("Reversed Number= " + rev);
  }
}