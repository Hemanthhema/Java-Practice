import java.util.Scanner;
class Peris{
  public static void main(String[] args){
    int a,b,c,d,perimeter;
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c= sc.nextInt();
    d=sc.nextInt();
    

     perimeter = a+b+c+d;
    System.out.println("perimeter="+perimeter);
  }
}