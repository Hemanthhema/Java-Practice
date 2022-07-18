import java.util.Scanner;
class Friday{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int s;
    s=sc.nextInt();
    char arr[] =new char[s];
    System.out.println("enter array elements");
    for(int i=0;i<s;i++){
      arr[i]=sc.next().charAt(0);
    }
    for(int i=0;i<s;i++){
      System.out.println((int)arr[i]);
    }
  }
}