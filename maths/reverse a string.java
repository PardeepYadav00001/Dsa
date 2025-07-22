import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      String str = "hello";
      
      String res = "";
      System.out.println(str.length());
      for(int i=str.length()-1;i>=0;i--){
        res+=str.charAt(i);
      }
      System.out.println(res);
  }
}