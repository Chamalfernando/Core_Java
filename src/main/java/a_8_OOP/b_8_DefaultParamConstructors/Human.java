package a_8_OOP.b_7_Constructors;

public class Human {

    private int age;
    private String name;

    // Constructor.
    // This is useful for assign pre defined or agreed values to the properties.
    public Human()
    {
        age=12;
        name="John";
        System.out.println("in constructor");
    }
    // every time you create a new object it will call the constructor.
    // when it comes to database connections this will be very helpful.

    public int getAge(){
        return age;
    }
    public void SetAge(int age)
    {
        this.age=age;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

}
