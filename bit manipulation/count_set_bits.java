import java.util.*;
//count no of set bits 
public class Main {
  public static int count_set_bits(int n){
    int res =0;
 while(n>0){
   if((n&1)==1){  //n&1 = n%2==0
     res++;
   }
   n=n>>1; // n=n/2
 }
    return res;
  }
  
  public static int count_set_bits1(int n){
   int ans=0;
    
    while(n!=0){
  
  n=n&(n-1);
  ans++;    
    }
    return ans;
  }
  
  
    public static void main(String[] args) {
     System.out.println(count_set_bits(10));
     System.out.println(count_set_bits1(10));
  }
}