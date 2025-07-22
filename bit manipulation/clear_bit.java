import java.util.*;
//clear the bit 
public class Main {
  public static int clear_bit(int n,int i){
    
    int res = n&~(1<<i);
    return res;
    
    
  }
  
    public static void main(String[] args) {
     System.out.println(clear_bit(10,2));
  }
}