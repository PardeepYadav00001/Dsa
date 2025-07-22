import java.util.*;
// reverse a no 
public class Main {
    public static void main(String[] args) {
     int n = 7789;
     int res=0;
     while(n>0){
       
       int lastdigit = n%10;
        res=  (res*10)+lastdigit;
   n = n/10;
      
     }
     System.out.println(res);
  }
}