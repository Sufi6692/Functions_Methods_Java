import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20,25);

        System.out.println(ans);

    }


    // pass the value of numbers when you are calling the method in main()

    static int sum3 (int a,int b){

        int sum = a + b;
        return sum;

   }


    static int sum2(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();
        int sum2 = num1 + num2;

//        System.out.println(" The sum is : " + sum);

          return sum2;

          /*

          return_type name (arguments){

            //body
            return statement
          }
           */


    }
}
