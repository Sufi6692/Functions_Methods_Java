public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;



        swap(a,b);

        System.out.println(a+" "+b);

        String name = "Sufi khalandar";
         changeName (name);
        System.out.println(name);

        }

        static  void changeName (String name){
        name = "Rahul Rana";


        }
        static void swap(int num1, int num2){

        int temp = num1;
        num1 = num2;
        num2 = temp;

        //this change will only be valid in this function scope only


    }
}
