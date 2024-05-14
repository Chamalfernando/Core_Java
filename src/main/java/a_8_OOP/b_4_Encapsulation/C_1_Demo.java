package a_8_OOP.b_4_Encapsulation;

public class C_1_Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Human obj = new Human();

        // binding our data with the methods.
        obj.SetAge(30);
        obj.setName("Reddy");

//		obj.age=11;
//		obj.name="Navin";

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
