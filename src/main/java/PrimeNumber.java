public class PrimeNumber {


    //Find a list of Prime numbers from number 2 to 10000

    public static void main(String[] args) {

        while (true) {
            int pRandom = (int) (Math.random() * (10000 - 2) + 2);
            if(isPrime(pRandom)){
                System.out.println("Got Random Prime P :"+pRandom);
                break;
            }
        }
        while(true){
            int qRandom = (int) (Math.random() * (10000 - 2) + 2);
            if(isPrime(qRandom)){
                System.out.println("Got Random Prime Q :"+qRandom);
                break;
            }
        }

    }

    private static boolean isPrime(int n) {
        int i;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}



