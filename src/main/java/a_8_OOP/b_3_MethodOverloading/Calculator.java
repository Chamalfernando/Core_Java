package a_8_OOP.b_3_MethodOverloading;

public class Calculator {
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public double add(double n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
}
