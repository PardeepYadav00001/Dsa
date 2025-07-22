import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    int arr[] = {12,-1,-7,8,-15,30,16,28};
   int k=3;
   int n = arr.length;
   int result[] = new int[n-k+1];
   
   for(int i=0;i<n-k+1;i++){ // n*k
  
     for(int j=0;j<k;j++){ // k
       if(arr[i+j]<0){
           result[i]=arr[i+j];
           break;
       }
     // total tc = (n*k)*k = n
     }
   }
     for(int i=0;i<result.length;i++){
     System.out.print(result[i]+" ");
   }
    
  }
}
// it also done by using queue data structure make a queue of size k and find first elemnt after every sliding 