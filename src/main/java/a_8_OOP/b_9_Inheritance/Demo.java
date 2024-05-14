package a_8_OOP.b_9_Inheritance;

public class Demo {
    public static void main(String[] args) {
        Calc obj1=new Calc();
        int r1=obj1.add(4, 5);
        int r2=obj1.sub(7,3);
        System.out.println(r1+" "+r2);

        AdvCalc obj=new AdvCalc();
        int r3=obj.add(4, 5);
        int r4=obj.sub(7,3);
        int r5=obj.multi(5,3);
        int r6=obj.div(15,4);

        System.out.println(r3 + " " + r4 + " " + r5 + " " + r6);
    }
}
