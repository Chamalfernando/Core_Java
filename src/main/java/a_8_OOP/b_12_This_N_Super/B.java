package a_8_OOP.b_12_This_N_Super;

public class B extends A{
    public B()
    {
        super(45);
        System.out.println("in B");
    }

    public B(int n)
    {
        super(n);
        System.out.println("in int B");
    }
}
