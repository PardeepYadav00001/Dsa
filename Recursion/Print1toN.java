import java.util.*;

public class Main {
  
  public static void Print1toN(int n ){
    if(n==0){
      return ;
    }
   
    Print1toN(n-1);
     System.out.println(n);
    
  }
    public static void main(String[] args) {
    Print1toN(5);
  }
}