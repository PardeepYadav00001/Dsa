import java.util.*;
// check if a no is primeor not 
public class Main {
  
  public static Boolean checkprime(int n ){
    int count =0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
      
    }
    
    if(count==2){
      return true;
    }
  return  false;
  }
  
  // 2nd way better approach 
  
  public static void check_prime(int n ){
    int count =0;
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    if(count>1){
      System.out.println("not prime no");
    }else{
      System.out.println("yes it is a prime no ");
    }
    
  }
  
  
    public static void main(String[] args) {
    
    int no = 37;
    System.out.println(checkprime(no));
    check_prime(no);
    
    
    
  }
}