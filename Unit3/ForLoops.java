public class ForLoops {
    public static void main(String[] args){
        FindPrimes(500);
        
    }

    public static void printUpTo(int n){
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
    }
    public static boolean isPrime(int n){
        if (n<=1) return false;
        for (int i = 2; i<((n/2)+1); i++) if (n%i == 0) return false;
        return true;

    }

    public static int FindNthPrime(int n){
        int upTo = 1;
        int i = 0;
        while (true){
            if (isPrime(i)){
                if (upTo++ == n){
                    return i;
                }
            }
            i++;

        }
    }

    public static void FindPrimes(int n){
    int upTo = 1;
    int i = 0;
    while (true){
        if (isPrime(i)){
            System.out.println(i);
            if (upTo++ == n){
                return;
            }
        }
        i++;

    }
}
}

