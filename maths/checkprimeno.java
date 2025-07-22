import java.util.*;
// check prime no 
public class Main {
  public static Boolean checkprimeno(int n ){
    
    for(int i=2;i<n;i++){
      if((n%i) ==0)
        return false;
      
    }
    
    return true;
  }
  
    public static void main(String[] args) {
    
    int n = 4;
    System.out.println(checkprimeno(n));
    
    
  }
}