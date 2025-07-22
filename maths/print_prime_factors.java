import java.util.*;
//print all prime factors example i/p = 60 o/p = 2,3,5
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
  

  public static void print_prime_factors(int n){
    int count =0;
    for(int i=1;i*i<n;i++){
      if(n%i==0){
       if(checkprime(i)==true){
         System.out.print(i+" ");
       }
      }
    
    }
  }
  
  public static void print_prime_fact(int n ){   // tc o(sqrt(n)*log n)
    
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
     
        System.out.print(i+" ");
        while(n%i==0){
        n=n/i;
        }
      }           
    }  if (n > 1) {
        System.out.print(n);  // Remaining prime factor
    }
  }
  
  
    public static void main(String[] args) {
      int no = 780;
      print_prime_factors(no);
      System.out.println();
      print_prime_fact(no);
  }
}