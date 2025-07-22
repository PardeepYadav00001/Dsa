import java.util.*;
//swap to nos 
public class Main {
  
  public static void swap(int a,int b){
    
    a= (a^b);
    b=a^b;
    a=a^b;
    
    System.out.println("value of a :"+ a);
    System.out.println("value of b :"+ b);
    
  }
  
  
    public static void main(String[] args) {
     
     swap(13,10);
     
  }
}