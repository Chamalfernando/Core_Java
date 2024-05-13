package a_10_StackNHeap;

public class StackNHeap {
    public static void main(String[] args) {
        int data = 10;
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        int res = cal1.add(23, 34);

        int res1 = cal2.add(2, 5);
        System.out.println(res);
        System.out.println(res1);

        cal2.num = 90;
        System.out.println(cal1.num);
        System.out.println(cal2.num);

    }
}
