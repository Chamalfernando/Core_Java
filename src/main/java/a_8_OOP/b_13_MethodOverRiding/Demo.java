package a_8_OOP.b_13_MethodOverRiding;

public class Demo {
    public static void main(String[] args) {
        //		B obj=new B();
        //		obj.show();
        //		obj.config();

        AdvCalc obj=new AdvCalc();
        int r1=obj.add(3, 4);
        System.out.println(r1);
    }
}
