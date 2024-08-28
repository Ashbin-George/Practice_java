public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        for(int i = n; i >= 1; i--)
        {
             k = (i * k);
        }
        System.out.println("factorial"  +k);
    }
}
