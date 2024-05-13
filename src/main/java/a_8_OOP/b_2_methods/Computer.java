package a_8_OOP.b_2_methods;

public class Computer {
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }
    public String getMeAPen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";
    }
}
