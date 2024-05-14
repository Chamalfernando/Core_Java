package a_8_OOP.b_12_This_N_Super;

// Every class in java extends Object class.
public class A extends Object{
    public A()
    {
        super();
        // when you use this you're basically calling constructor of the
        // Object class.
        System.out.println("in A");
    }

    public A(int n)
    {
        // this will execute the super() of the super class.
        super();
        System.out.println("in int A");
    }
}
