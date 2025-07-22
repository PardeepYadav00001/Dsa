import java.util.*;
//remove the last set bit (right most) 
public class Main {
  public static int clear_bit_right_most(int n){
    int n1 = n-1;
    int res = n& n1;
    return res;
    
    
  }
  
    public static void main(String[] args) {
     System.out.println(clear_bit_right_most(13));
  }
}