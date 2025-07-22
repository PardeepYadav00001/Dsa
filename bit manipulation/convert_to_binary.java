import java.util.*;
// convert to binary
public class Main {
  public static String convert_to_binary(int n ){
    
    String res ="";
 
  while (n !=1){
    if(n%2==1){
      res+="1";
    }else if(n%2==0){
      res+="0";
    }
    
    n=n/2;
  }
     if(n==1){
      res+="1";
    }
    
    return res; // reverse the res to get o/p
    
  }
  
  public static String convert_toBinary(int n) {
String res="";
while(n>0){
  if(n%2==1){
    res="1"+res;
  }else{
    res="0"+res;
  }
  n=n/2;
}    
   return res; 
  }
    public static void main(String[] args) {
    
    System.out.println(convert_to_binary(13));
    System.out.println(convert_toBinary(13));
  }
}