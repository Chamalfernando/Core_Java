package a_8_OOP.b_4_Encapsulation;

public class Human {

    //int age;
    //String name;

    //private int age=11;
    //private String name="Navin";

    private int age;
    private String name; // instance variable

    // getter
    public int getAge()
    {
        return age;
    }
    public void SetAge(int a)
    {
        age/* instance variable */ = a;// local variable
    }
    // No need to pass the obj.

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }

    // right click -> source action -> Generate getters and setters.

}
