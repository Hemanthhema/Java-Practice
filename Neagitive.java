import java.util.Scanner;
class Neagitive{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter size");
    int s,count=0;
    s=sc.nextInt();
    int arr[] =new int[s];
    System.out.println("enter array elements");
    for(int i=0;i<=s;i++){
      arr[i]=sc.nextInt();
    }
    
      System.out.println("neagitive numbers");
      for(int i=0;i<s;i++){
      if(arr[i]<0){
         count++;
      System.out.println(arr[i]);    
      }
        else
        System.out.println("error");
    }
    System.out.println(count);
  }
  
}