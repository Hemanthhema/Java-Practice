import java.util.Scanner;
class Productfl{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number,product=1,r;
    System.out.println("enter a number");
      number=sc.nextInt();
    while(number>0){ // 123>0 =t ,12>0=t
   r=number%10; //123%10=3,12%10=2
      product= product*r;//0*3=0 p=3*2=6
      number=number/10; //123/10=12,12%10
      
    }
    System.out.println("the product ="+product);
    
    
  }
}