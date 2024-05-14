package a_11_Arrays;

public class First {
    public static void main(String[] args) {
        //      int nums[]= {3,7,2,4};
        //		nums[1]=6;
        //		System.out.println(nums[1]);
        //		System.out.println(nums[0]);

        int nums[]=new int[4]; // by default created value has all 0s in it.
        nums[0]=4;
        nums[1]=8;
        nums[2]=3;
        nums[3]=9;

        //		System.out.println(nums[0]);
        //		System.out.println(nums[1]);
        //		System.out.println(nums[2]);
        //		System.out.println(nums[3]);

        for (int i=0;i<4;i++) {
            System.out.println(nums[i]);
        }

        ///////////////////////////////////////////////////

        int num1[] = { 3, 4, 5, 6, 0 };
        num1[2] = 9;

        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }

    }
}
