package a_8_OOP.b_8_DefaultParamConstructors;

public class Human {

    private int age;
    private String name;

    // default constructor
    public Human()
    {
        age=12;
        name="John";
    }
    public Human(String name) {
        this.age=23;
        this.name=name;
    }

    // parameterized constructor.
    public Human(int age, String name)
    {
        this.age=age;
        this.name=name;
    }


//	public Human()    //default constructor
//	{
//		age=12;
//		name="John";
//		//System.out.println("in constructor");
//	}
//	public Human(int a, String n)  //Parameterized constructor
//	{
//		age=a;
//		name=n;
//	}

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
