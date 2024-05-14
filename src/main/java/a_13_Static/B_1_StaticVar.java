package a_13_Static;

public class B_1_StaticVar {
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
        //Changing like this will affect other objects as well.
        // Static variable is shared by all the objects.A common variable which will be used by all the objects.
        // Basically we won't be  having individual static variable for every object.
        // Instead we have a common object.
        // There is a different area in the JVM, where all the static variables resides.

        // Static variables should be called by their class name.
        Mobile.name="SmartPhone";
        // The static field Mobile.name should be accessed in a static way.
        // Creating a class member not an object member.


        obj1.show();
        obj2.show();

        //System.out.println(obj1.brand);
    }
}
