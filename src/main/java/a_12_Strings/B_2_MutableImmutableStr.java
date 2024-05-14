package a_12_Strings;

/*
 Mutable Strings - can change

 * immutable Strings - cannot change.
 *
 * By default Strings are immutable.
 *
 * Mutable strings can be implemented
 * by the String Buffer or by the String
 * Builder.

 */

public class B_2_MutableImmutableStr {
    public static void main(String[] args) {
        String name="navin";
        name=name+"reddy";
        System.out.println("hello"+name);

        String s1="Navin";
        String s2="Navin";

        System.out.println(s1==s2);
    }
}
