import java.util.Scanner;
class Eve{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("entern value");
    int n,i,sum=0;
    n=sc.nextInt();
    for(i=0;i<n;i++){
      if(i%2==0){
        sum=sum+i;
        System.out.println(i);
        
      }
    } System.out.print("the sum ="+ sum);
    
  }
}