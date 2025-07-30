import java.util.*;

public class Main {
  
  public static void printname(int n ){
    
    if(n==0){
      return;
    }
    System.out.println("pardeep");
    printname(n-1);
    
  }
  
  
    public static void main(String[] args) {
    printname(5);
  }
}