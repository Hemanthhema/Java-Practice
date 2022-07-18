import java.util.Scanner;
class Maxmin{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size");
    int s;
   
    s=sc.nextInt();
     System.out.println("enter elements");
    int arr [] = new int[s];
    int max=arr[0];int min=arr[0];
    for(int i=1;i<s;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=1;i<s;i++){
      if(arr[i]>max)
        max=arr[i];
    
    for(int i=1;i<s;i++)
      if(arr[i]<min)
        min=arr[i];
    }
     
    
    
    
    
    System.out.println(max);
    System.out.println(min);
}
}