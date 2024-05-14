package a_13_Static;

public class B_2_StaticMethod {
    // Why does the main method is static ?????
    /*
    * If you don't make main static,that means main becomes a non-static
    * method. Which means if you want to call main We have to first create
    * an object of the class in this case B_2_StaticMethod.
    * That means you can't call main without the object of B_2_StaticMethod.
    * But the question is we know that main is a static point of execution.
    * If the execution isn't started, how can you create an object of
    * B_2_StaticMethod ??????
    * Deadlock is occurring.
    *
    * By putting static keyword to main we are saying that in order to call main
    * there's no need to having an object of the class where the main resides.
    * */
    public static void main(String[] args) {

        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        //obj1.name="SmartPhone";
        Mobile.name="SmartPhone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1700;
        //obj2.name="SmartPhone";
        Mobile.name="SmartPhone";

        //obj1.name="Phone";
        Mobile.name="SmartPhone";

        obj1.show();
        obj2.show();

//        Mobile.show(obj2);
        // You can't call a non-static method using a class name.

        Mobile.show1(obj1);
        // You can call a static-method using a class name.

        //System.out.println(obj1.brand);
    }
}
