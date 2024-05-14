package a_8_OOP.b_12_This_N_Super;

public class Demo {
    public static void main(String[] args) {
        // run this by only using nothing (nor super() or this() in constructors)
        B obj = new B();
        // then it will call the constructors of subclass and super class both.

        // run this by only using nothing.(nor super() or this() in constructors
        B obj1 = new B(78);
        // then it will call the default in A and parameterized in B.

        // Every constructor by default have a method which is super(). i.e. first
        // statement of every constructor is super()


        // if you want to call the parameterized constructor in the super() in
        // the super class then you have to pass the argument to the super() in
        // the sub class.
        // run this by only using super() with a single argument.
        B obj2 = new B(10);

        C obj3 = new C(12);

    }
}
