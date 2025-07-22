import java.util.*;
// check if a bit is set or not 
public class Main {

  
  public static boolean check_bit(int n,int i){
  

  
  int n1 = (1<<i);
  int ans = (n & n1);
  
  if(ans==n1){
    return true;
  }else
    
    return false;
  }
  
  
    public static void main(String[] args) {
     
      System.out.println(check_bit(13,2));
  
  }
}