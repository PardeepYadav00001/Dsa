import java.util.*;
// print gcd (greatest comman divsion )
public class Main {
  
  public static void printgcd(int n1,int n2){
    int gcd =1;
    for(int i=1;i<=Math.min(n1,n2);i++){
      
      if(n1%i==0 && n2%i==0){
        gcd =i;
       
      }
      
    }
     System.out.print(gcd);
    
  }
  
  
    public static void main(String[] args) {
      
      int n1=20;
      int n2=40;
      printgcd(n1,n2);
      
      
      
  }
}