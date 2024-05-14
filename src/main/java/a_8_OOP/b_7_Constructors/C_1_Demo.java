package a_8_OOP.b_6_ThisKeyWord;

public class C_1_Demo {
    public static void main(String[] args) throws ClassNotFoundException {

        Human obj=new Human();

        obj.SetAge(30,obj);
//		obj.SetAge(30);
        obj.setName("Reddy");

//		System.out.println(obj.abc()+" : "+obj.getAge());
        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}
