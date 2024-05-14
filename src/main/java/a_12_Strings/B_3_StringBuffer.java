package a_12_Strings;

public class B_3_StringBuffer {
    public static void main(String[] args) {
        // String Buffer is thread safe.

        // String buffer give you a buffer size - 16bytes.
        StringBuffer sb= new StringBuffer("Navin");
		System.out.println(sb.length()); // 5
		System.out.println(sb.capacity()); // 21 bytes.
        sb.append("Reddy");
        System.out.println(sb);


		String str=sb.toString();

		sb.deleteCharAt(2);
		sb.insert(0,"Java");
		sb.insert(6,"java");
		sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);
    }
}
