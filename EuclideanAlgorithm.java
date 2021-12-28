import java.util.Scanner;
public class EuclideanAlgorithm {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        long a, b;

        System.out.print("Enter num 1: ");
        a = in.nextLong();
        System.out.print("Enter num 2: ");
        b = in.nextLong();
        in.close();

        System.out.println("GCD: " +  euc(a,b));
    }
    public static long euc(long a, long b){
        if(a == 0 || b == 0){
            return 0;
        }
        if(a % b != 0){
            return euc(b, a % b);
        } else {
            return b;
        }
    }
}
