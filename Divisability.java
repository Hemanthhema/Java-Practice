import java.util. Scanner;
class Divisability{
  public static  void main(String[] args) {
 Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("enter a value");
    a=sc.nextInt();
    
    if(a%5==0){
      System.out.println("a divisable with 5");
    }
      else if (a%11==0){
        System.out.println("a is divisable with11");
      }
      else{
        System.out.println("invalied");
      }
    
    
    
  }
}