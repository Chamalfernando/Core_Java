package a_4_Operators;

public class B_1_AssignmentOpr {
    public static void main(String[] args) {
//         int num1=7;
//         int num2=5;
//         int result=num1+num2;
//         System.out.println(result);

//         int num1=7;
//         int num2=5;
//         int result=num1-num2;
//         System.out.println(result);

//         int num1=7;
//         int num2=5;
//         int result=num1*num2;
//         System.out.println(result);

//         int num1=7;
//         int num2=5;
//         int result=num1/num2;
//         System.out.println(result);

//         int num1=7;
//         int num2=5;
//         int result=num1%num2;
//         System.out.println(result);

        int num=7;
//		num=num+2;
//      num-=2;
//		num+=2;
//		num*=2;

        num++;    //post increment
        ++num;    //pre increment
        num--;    //post decrement
        --num;	  //pre decrement
        System.out.println(num);

        int result=num++; //fetch the value and then increment
        //int result=++num; // first increment and then fetch the value
        System.out.println(result);
    }
}
