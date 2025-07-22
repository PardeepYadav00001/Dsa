import java.util.*;
// check arm strong no  
public class Main {
  
      public static Boolean checkarmstrongno(int n ){
        int original_no = n;
               int arm=0;
     while(n>0){
       
       int lastdigit = n%10;
       arm += lastdigit*lastdigit*lastdigit;
        // we use math.pow if we use for more then 3 digit
   n = n/10;
      
     }
        if(original_no==arm){
       return true;
  } 
        return false;
  
}
    public static void main(String[] args) {
     int n =1634;

    System.out.println(checkarmstrongno(n));

}
}

   
 
 