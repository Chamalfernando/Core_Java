package a_15_AnonymousObject;

public class Demo {
    public static void main(String a[])
    {
        int marks;
        marks=99;

        // this is like an object creation.
        new A();   //anonymous object. Bcz they don't have a name.
        new A().show(); // use the show method for the object.
        // every time you type new A() it will create a new object.

		A obj=new A();
//        A obj;
        obj=new A();

        obj.show();
    }
}
