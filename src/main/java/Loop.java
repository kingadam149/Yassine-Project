public class Loop {
    // I want to print 1 to 200
    public static void main(String[] args) {

        int a = 1;

        while (a <= 20) {

            System.out.println(a);
            a++;
        }

        int b = 20;

        while (b >= 1) {

            System.out.println(b);
            b--;

        }

        for(int e = 1; e <= 20; e++){
            System.out.println(e);
        }
        for(int t = 20; t >= 1; t--){
            System.out.println(t);
        }
        for(int l = 1; l <= 30; l+=2){
            System.out.println(l);
        }

        for(int r = 2; r <= 40; r+=4){
            System.out.println(r);
        }
    }
}

