package a_8_OOP.b_5_GettersSetters;

public class Human {

    //int age;
    //private int age=11;
    private int age;
    //String name;
    //private String name="Navin";
    private String name;

    public int getAge()
    {
        return age;
    }
    public void SetAge(int age)
    {
        this.age=age;
    }

//	public void SetAge(int a)
//	{
//		age=a;
//	}

//	public int abc()
//	{
//		return age;
//	}
//	public void xyz(int a)
//	{
//		age=a;
//	}


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

//	public void setName(String n)
//	{
//		name=n;
//	}

    // right click -> source action -> Generate getters and setters.

}
