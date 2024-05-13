package a_3_TypeConversion;

public class Second {
    public static void main(String[] args) {

        int a = 330;
        // byte b = 12;
        byte k = (byte) a; // 330%256 = 74 type casting
        System.out.println(k);

        // Type promotion
        byte n1 = 10;
        byte n2 = 35;
        int num3 = n1 * n2;
        System.out.println(num3);
    }
}
