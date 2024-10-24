package BasicMaths;

public class PrimeNumber {
    private static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int k = 37;
        System.out.println(isPrime(11 ));
    }
}
