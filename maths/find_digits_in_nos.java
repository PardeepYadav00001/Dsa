public class Main {
    public static void main(String[] args) {
        int n = 776889789;
        int count = (int) (Math.log10(n) + 1); //Math.log10(n) ~3.8...
        
        System.out.println("Number of digits: " + count);
    }
}
