import java.util.Scanner:
class Sal{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float basic_salary,HRA,DA ,gross;
    System.out.println("enter amount");
    basic_salary =sc.nextInt();
    if(basic_salary<=1000){
      System.out.println("HRA=20%"+"DA=80%");
    }
    else if(basic_salary<=2000){
      System.out.println("HRA=25%"+"DA=90%");
    }
    else if(basic_salary>=20000){
      System.out.ptintln("HRA=30%"+"DA=95%");
    }
    else {
      System.out.println("invalied");
    }
      
    
      
    
  }
}