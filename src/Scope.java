public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String name = "sufi";



        {
 //      int a = 78;     // already initialised outside the block in the same method, hence you cannot initialise  again

             int c = 99;
             a = 100;// reassign the origin ref to some other value
             // values initialised in this block, will remain in block
            System.out.println(name);
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);

//        System.out.println(c);// cannot use outside the block

        //Scoping in for loops
        for (int i = 0; i < 4; i++ ){
            System.out.println(i);
            int num = 90;
          //  int a = 4; // you can't crate the same variable again anywhere if you create outside
             a = 1000;

        }



    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
