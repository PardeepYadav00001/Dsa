import java.util.*;

public class Main {
  
  public static void combinationsum(int i, int target,ArrayList<Integer> numbers,int arr[]){
    
   int n = arr.length;
   
 
   // base case
     
   if(target==0){
     System.out.println(numbers);
     return;
   }
    // If we reach end of array or target becomes negative, return
        if (i == n || target < 0) {
            return;
        }
    
    // Pick the current number (can reuse same index)
        numbers.add(arr[i]);
        combinationsum(i, target - arr[i], numbers, arr);  // Stay at same i
        numbers.remove(numbers.size() - 1); // Backtrack
    
    
    
    combinationsum(i+1,target,numbers,arr);
    
  }
    public static void main(String[] args) {
      int arr[] = {2,3,6,7};
      ArrayList<Integer> numbers = new ArrayList<>();
      combinationsum(0,7,numbers,arr);
  }
}