package a_8_OOP.b_2_methods;

public class Methods {
    public static void main(String[] args) {
        Computer obj=new Computer();
        obj.playMusic();
        String src=obj.getMeAPen(10);
        System.out.println(src);
    }
}
