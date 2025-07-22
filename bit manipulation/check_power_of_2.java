import java.util.*;
//check no is a power of 2 
public class Main {
  public static Boolean check_power_of_two(int n){
    int n1 = n-1;
    int res = n& n1;
    
    
    if(res==0){
      return true;
    }
    return false;
    
    
  }
  
    public static void main(String[] args) {
     System.out.println(check_power_of_two(4));
  }
}