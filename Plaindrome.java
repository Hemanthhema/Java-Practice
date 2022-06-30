import java.util.Scanner;
class Plaindrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num , rev = 0, remainder;
    System.out.println("enter anumbar");
    num=sc.nextInt();
    int ori = num;
    while (num != 0) { ///123 !=0 t,t
      remainder = num % 10;//123%10=3,12%10=2
      rev = rev * 10 + remainder; ///3,32
      num =num/ 10;//123/10=12
    }
    if (ori == rev) {
      System.out.println(ori + " is Palindrome");
    }
    else {
      System.out.println(ori + " is not Palindrome");
    }
  }
}