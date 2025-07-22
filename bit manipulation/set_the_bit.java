import java.util.*;
// set the bit 
public class Main {
  public static int setbit(int n ,int i){
    
    int n1= (1<<i);
    
    int res = (n|n1);
    
    return res;
    
    
  }
  
    public static void main(String[] args) {
    
    System.out.println(setbit(9,2)); 
}
}