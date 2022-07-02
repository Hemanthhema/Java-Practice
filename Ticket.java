import java.util.Scanner;

class Ticket{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter age");
    
    int age;
    age = sc.nextInt();
    if(age>15){
      System.out.println("is adult");
    }
    else{
     System.out.println("chaild"); 
    }
  }
}