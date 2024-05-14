package a_8_OOP.b_12_This_N_Super;

public class C extends A{
    public C()
    {
        super();
        System.out.println("in C");
    }

    public C(int n)
    {
        this();// this will execute the constructor of the same class.
        System.out.println("in int C");
    }
}
