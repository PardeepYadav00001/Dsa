import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    // extraction of digits 
    
    int n = 7789;
    
    while(n>0){
      
      int lastdigit = n%10;
      System.out.println(lastdigit);
      n=n/10;
      
    }
  }
}