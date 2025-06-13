import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,3);
        multiple(2,3,55,55,55,5,5,5,5,5,4,4,4,4,4);

    }

    static void multiple(int a, int b, int...v){

    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));

    }
}
