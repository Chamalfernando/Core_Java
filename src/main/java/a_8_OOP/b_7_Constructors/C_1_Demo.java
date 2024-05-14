package a_8_OOP.b_7_Constructors;

public class C_1_Demo {
    public static void main(String[] args) throws ClassNotFoundException {

        Human obj=new Human();
        Human obj1=new Human();

        // When you create the object in the heap memory, it will create a blank object.
        System.out.println(obj.getName()+" : "+obj.getAge());
        // will output null : 0.

        obj.SetAge(30);
        obj.setName("Reddy");
        // if these 2 lines are commented the constructor's values would be displayed.


        //System.out.println(obj.getName()+" : "+obj.getAge());

    }
}
