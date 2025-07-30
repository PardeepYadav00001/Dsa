import java.util.*;

public class Main {
  
  public static Boolean checkpalindrome(String str,int i){
    
    int n = str.length();
    if(i==(n/2)){
      return true;
    }
    if(str.charAt(i)!=str.charAt(n-1-i)){
      return false;
    }
   
    return  checkpalindrome(str,i+1);
    
  }
  
  
    public static void main(String[] args) {
    System.out.println(checkpalindrome("1",0));
  }
}