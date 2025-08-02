import java.util.*;

public class Main {
  
  
  
  public static Boolean Printsubsequencesumk(int i,ArrayList<Integer> ans,int arr[],int sum,int s){
    int n = arr.length;
    if(n==i){
      if(sum==s){
        System.out.println(ans);
         return true;
      }
     return false;
    
    }
    
    ans.add(arr[i]);
    s+=arr[i];
    
       if (Printsubsequencesumk(i + 1, ans, arr, sum, s)) {
            return true;
        }
    
    ans.remove(ans.size()-1);
    s -= arr[i];
    
        if (Printsubsequencesumk(i + 1, ans, arr, sum, s)) {
            return true;
        }
    
    return false;
  }
    public static void main(String[] args) {
     int arr[] = {1,3,4};
      ArrayList<Integer> ans = new ArrayList<>();
      
      Printsubsequencesumk(0,ans,arr,2,0);
      
  }
}