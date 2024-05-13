package a_5_ConditionalStmts;

public class B_4_Fourth {
    public static void main(String[] args) {
        int x = 2;
        int result = 0;

        // if (x % 2 == 0) {
        // result = 10;
        // } else {
        // result = 20;
        // }

        // TERNARY OPERATOR

        result = x % 2 == 0 ? 10 : 20;

        System.out.println(result);
    }
}
