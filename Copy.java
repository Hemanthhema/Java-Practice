import java.util.Scanner;
class Copy{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size of an array");
    int s;
    s=sc.nextInt();
    int arr[]=new int[s];
    int brr[]=new int[s];
    System.out.println("enter the values");
    for(int i=0;i<s;i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<s;i++){
      System.out.println(arr[i]);
    }
    System.out.print("second array elements");  
    for(int i=0;i<s;i++){
      brr[i]=arr[i];
      System.out.println(brr[i]);
    }
  }
}