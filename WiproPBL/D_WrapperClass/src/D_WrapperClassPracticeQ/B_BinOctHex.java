package D_WrapperClassPracticeQ;

public class B_BinOctHex extends A_MaxMinWrapper {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println("Binary : "+Integer.toBinaryString(a));
        System.out.println("Octal : "+Integer.toOctalString(a));
        System.out.println("Hexadecimal : "+Integer.toHexString(a));
    }
}
// java B_BinOctHex.java 3
// Binary : 11
// Octal : 3
// Hexadecimal : 3