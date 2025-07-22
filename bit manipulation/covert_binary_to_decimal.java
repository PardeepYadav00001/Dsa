import java.util.*;
//convert binary to decimal 
public class Main {
  
  public static int binary_to_decimal(int n){
    
    int leng = String.valueOf(n).length();
    int res =0;
    
 for(int i=0;i<leng;i++){
   int remi = n%10;
   int value = (int)(remi*Math.pow(2,i));
   res+=value;
   n=n/10;
 }
    
    return res;
  }
  
  
    public static void main(String[] args) {
      System.out.println(binary_to_decimal(1010));
    
  }
}