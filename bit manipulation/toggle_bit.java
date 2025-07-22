import java.util.*;
//toggle the bit 
public class Main {
  public static int toggle_bit(int n,int i){
    
    int res = n^(1<<i);
    return res;
    
    
  }
  
    public static void main(String[] args) {
     System.out.println(toggle_bit(13,1));
     
  }
}