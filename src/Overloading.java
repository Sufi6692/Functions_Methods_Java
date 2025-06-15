public class Overloading {
    public static void main(String[] args) {
        fun("sufi");
        fun(34);

        int ans = sum(4,5);
    }

    static int sum(int a , int b){

        return a + b;
    }

    static int sum(int a, int b, int c){
        return  a + b + c;
    }


    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);

    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);

    }
}
