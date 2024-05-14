package a_8_OOP.b_5_GettersSetters;

public class C_1_Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Human obj=new Human();
//		obj.xyz(30);
        obj.SetAge(30);
        obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";

//		System.out.println(obj.abc()+" : "+obj.getAge());
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
