import java.util.Scanner;
class Blood{
  public static void main(String[] args){
    int weight,age;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter weight");
    
    weight=sc.nextInt();
    System.out.println("enter age");
    age= sc.nextInt();
    if(weight>55&&age>18){
      System.out.println("eligible");
    }
    else{
    {
      System.out.println("in eligible");
      }
    }
  }
}