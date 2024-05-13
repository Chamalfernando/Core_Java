package a_3_TypeConversion;

public class First {
    public static void main(String[] args) {
        //byte x = 257;
        byte b=127;
        int a=b;
        System.out.println(b);
        System.out.println(a);

        byte b1=125;
        int a0=b1;
        System.out.println(b1);
        System.out.println(a0);

        int aa=257;
        byte k=(byte)aa;
        System.out.println(k);

        float f=5.6f;
        int t=(int)f;
        System.out.println(t);

        int a2=2567;
        byte b2=(byte)a;
        System.out.println(k);

        byte a3=10;
        byte b4=20;
        // Type Promotion
        int cc=a*b;
        System.out.println(cc);
    }
}
