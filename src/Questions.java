import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println("This number is Prime : "+ans);

        System.out.println("This number is Armstrong : "+isArmstrong(n));

        System.out.println("Check all 3 digit Armstrong Numbers : ");
        for (int i = 100; i <=999; i++){
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    // print all the 3 digits armstrong numbers
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;

        }

       return  sum == original;
    }
    static boolean isPrime(int n){
        if(n <=1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if(n % c == 0){
                return  false;
            }
            c++;
        }
        return c * c > n;
    }
}
