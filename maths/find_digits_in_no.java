import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    // find digits in a no 
    
    int n = 776889789;
    int count =0;
    
    while(n>0){
      
      int lastdigit = n%10;
      count++;
      n= n/10;
      
    }
    System.out.println(count);

      
    }
  }
