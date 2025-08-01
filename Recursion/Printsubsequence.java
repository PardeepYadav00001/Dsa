import java.util.*;

public class Main {
  
  
  
  public static void Printsubsequence(int i,ArrayList<Integer> ans,int arr[]){
    int n = arr.length;
    if(n==i){
      System.out.println(ans);
      return;
    }
    
    ans.add(arr[i]);
    Printsubsequence(i+1,ans,arr);
    
    ans.remove(ans.size()-1);
    
    
    Printsubsequence(i+1,ans,arr);
    
  }
    public static void main(String[] args) {
     int arr[] = {1,2,3};
      ArrayList<Integer> ans = new ArrayList<>();
      
      Printsubsequence(0,ans,arr);
      
  }
}