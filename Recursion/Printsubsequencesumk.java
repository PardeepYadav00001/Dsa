import java.util.*;

public class Main {
  
  
  
  public static void Printsubsequencesumk(int i,ArrayList<Integer> ans,int arr[],int sum,int s){
    int n = arr.length;
    if(n==i){
      if(sum==s){
         System.out.println(ans);
      }
     
      return;
    }
    
    ans.add(arr[i]);
    s+=arr[i];
    
    Printsubsequencesumk(i+1,ans,arr,sum,s);
    
    ans.remove(ans.size()-1);
    s -= arr[i];
    
    Printsubsequencesumk(i+1,ans,arr,sum,s);
    
  }
    public static void main(String[] args) {
     int arr[] = {1,2,3};
      ArrayList<Integer> ans = new ArrayList<>();
      
      Printsubsequencesumk(0,ans,arr,2,0);
      
  }
}