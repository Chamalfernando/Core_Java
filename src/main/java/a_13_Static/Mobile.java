package a_13_Static;

public class Mobile {
    String brand;
    int price;
    String network;
    //	String name;

    // This variable is common to all objects.
    static String name;
    // Static variables belong to the class not to the object.


//    public static void main(String[] args) {
//
//    }


    public void show() {
        System.out.println(brand+" : "+price+" : "+name);
        // In non static methods you can use static variables.
    }

    public static void show1(Mobile obj)
    {
//		System.out.println("in static method");
        System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
        // You have to have a object reference in order to call the
        // non-static variables in a static method.
    }

    // ########################## Static Block ######################

    // static block
    // static block will be called only once. Irrespective of how many objects you
    // create, it will call the static block only once.
    static {
        name="Phone";
        System.out.println("in static block");
    }

    // Constructor.
    public Mobile() {
        brand="";
        price=200;
//		name="Phone";
        System.out.println("in constructor");
    }
}
