import java.util.Scanner;
class Armstrong{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n,r,arm=0,temp;
    
    System.out.println("Enter the value");
    n=sc.nextInt();
    while(n>0){
      r=n%10;  //153%10=3 ,r=0/15%10=5/1%10=1
      arm=(r*r*r)+arm; //27+0=27/27+125=152+1=153
      n=n/10; //153/10=15/15/10=1
      
    }
      n=temp;
  if(n==arm){
    System.out.println("Armstrong number");
  }
    else {
      System.out.println("not a armstrongnumber");
    }
  }
}
