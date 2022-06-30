import java.util.Scanner;
class Arm{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n,s=0,r,k=0,count=0;
    System.out.println("Enter n value");
    n=sc.nextInt();
    k=n;
    while(n>0){  //153 t 1
      
      r=n%10;  //153%10=3
      s=(r*r*r)+s; //27+0=27
      n=n/10;  //153/10 15
    }
     if(k==s){
      System.out.println("Armstrong");
     }
    else{
  
     System.out.println("not a armstrong number");
       }
  }
}