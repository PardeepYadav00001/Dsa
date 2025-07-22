import java.util.*;
// power exponetion 
public class Main {
  public static int power(int x, int n){
    
int ans =1;
while (n>0){
  if(n%2==1){
     ans = ans*x;
    n=n-1;
   
  }else{
    n=n/2;
    x= x*x;
  }
}
   return ans; 
  }
    public static void main(String[] args) {
     
   
     
    System.out.println(power(2,5)); 
  }
}