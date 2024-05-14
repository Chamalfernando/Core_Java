package a_12_Strings;

public class B_1_WhatIsString {
    public static void main(String[] args) {
        // String is a reference type. Also a class.
        // Every string you create in java is a constant in java.
        // Those are reside in the string constant pool in the heap memory.


        //String name="Navin";
        String name = new String("Chamal");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("hello "+name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat("reddy"));
    }
}
