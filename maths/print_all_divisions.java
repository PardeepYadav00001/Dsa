import java.util.*;
// print all divisions 
public class Main {
  
   public static void printalldivision(int n ){
    
    for(int i=1;i<=n;i++){
    
    if(n%i==0){
System.out.print(i);  
if(n!=i){
  System.out.print(",");
}

    }
  }
   }
    public static void main(String[] args) {
int n =36;
  printalldivision(n);
  }
}