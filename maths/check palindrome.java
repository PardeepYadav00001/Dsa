import java.util.*;
// check palindrome 
public class Main {
  
      public static Boolean checkpalindrome(int n ){
        int original_no = n;
       int res=0;
     while(n>0){
       
       int lastdigit = n%10;
        res=  (res*10)+lastdigit;
   n = n/10;
      
     }
     if(original_no==res){
       return true;
      
     }
    return false;
        
        
  }
  
  
  
    public static void main(String[] args) {
     int n = 1121;

    System.out.println(checkpalindrome(n));

}
}

   