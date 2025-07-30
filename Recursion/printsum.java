import java.util.*;
// print sum upto n usning recursion 
public class Main {
  
  public static int printsum(int n){
    int ans=0;
    if(n<=1){
      return n;
    }
  return n+printsum(n-1);
  }
  
  public static void printsum2(int n ,int sum){
    
    if(n<1){
      System.out.println(sum);
      return;
    }
    printsum2(n-1,sum+n);
    
  }
  
    public static void main(String[] args) {
     
     System.out.println(printsum(3));
     printsum2(3,0);
  }
}