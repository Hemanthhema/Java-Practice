import java.util.Scanner;
class Maxofthree{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a,b,c;
    System.out.println("enter a b c values");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b&&a>c){
      System.out.println("a is maximam");
    }
     else if (b>a&&b>c){
        System.out.println("b is maximam");
     }
      else  if(c>a&&c>b){
          System.out.println("c is maximam");
      }
        }
      }
    
    else {
      System.out.println("in valied");
    }
    
      
  }
}