package a_8_OOP.b_3_MethodOverloading;

public class Demo {
    public static void main(String[] args) {
        Calculator obj=new Calculator();

        int r1=obj.add(3,4);
        System.out.println(r1);

        double r2=obj.add(5.4,4);
        System.out.println(r2);

        int r3=obj.add(10,34,2);
        System.out.println(r3);
    }
}
