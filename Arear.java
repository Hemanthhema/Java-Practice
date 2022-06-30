import java.util.Scanner;

class Arear{
  public static void main(String[] args){
    int length,breath,area;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter length");
    length =sc.nextInt();
    System.out.println("enter breath");
    breath =sc.nextInt();
    
     area = length*breath;
    System.out.println("area of rectriangle ="+ area);
  }
}