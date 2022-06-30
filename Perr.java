import java.util.Scanner;
class Perr{
  public static void main(String[] args){
    int a,b,perimeter;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a&b");
    a=sc.nextInt();
    b=sc.nextInt();
     perimeter= 2*(a+b);
    System.out.println("perimeter="+perimeter);
    
  }
}