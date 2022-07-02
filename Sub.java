import java.util.Scanner;
class Sub{
  public static void main(String[] args){
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the values of a,b");
    a=sc.nextInt();
    b=sc.nextInt();
    c= a-b;
    System.out.println("c="+c);
  }
}