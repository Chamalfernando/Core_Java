package a_7_Loops;

public class B_1_ForLoops {
    public static void main(String[] args) {
        //repeat this statement 4 times
        //loop -while, do while, for

        //100 - condition

        System.out.println("Hi");

        for(int i=0;i<=4;i++)
        {
            System.out.println("Hi"+i);
        }


        // nested for loop in java.
        for(int i=1;i<=7;i++)
        {
            System.out.println("Day "+i);
            for(int j=1;j<=9;j++)
            {
                System.out.println(" "+(j+8)+"-"+(j+9));
            }
        }


        int i=1;
        for(;i<=5;)
        {
            System.out.println("DAY"+i);
            i++;
        }

    }
}
