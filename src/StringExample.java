import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//         String msg = greet();
//        System.out.println(msg);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");

        String Name = input.nextLine();
       String personalised  = myGreet(Name);
        System.out.println(personalised);
    }

     static String myGreet(String name) {
        String message = name + " Welcome to Coder world";
        return message;
    }

    static String greet(){

        String greeting = "how are you";
        return  greeting;
    }
}
