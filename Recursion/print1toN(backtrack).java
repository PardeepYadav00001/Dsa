import java.util.*;

public class Main {
  
  public static void print1toN(int n ,int current){
    
    if(current==0){
      return;
    }
    
      // Recursive call goes deep first
    print1toN(n, current - 1);

    // Backtracking step: print while coming back
    System.out.println(current);
  }
  
  
    public static void main(String[] args) {
     print1toN(5,5);
  }
}