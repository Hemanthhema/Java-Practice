import java.util.Scanner;
class Evenorodd{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("enter a value");
    a=sc.nextInt();
    if(a%2==0){
      System.out.println("a is even number");
    }
    else {
    System.out.println("a is odd");  
    }
      
    
  }
}