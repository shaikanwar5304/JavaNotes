package a_WrapperClass;

public class B_Character {
    public static void main(String args[]) {
        char c = 'A';
        Character ch = c;
        System.out.println("Character: " + ch);// Character: A
        System.out.println("Character: " + ch.charValue());// Character: a
        System.out.println("Character: " + ch.compareTo('B'));// Character: -1
        System.out.println("Character: " + ch.equals('A'));// Character: true
        System.out.println("Character: " + ch.hashCode());// Character: 65
        System.out.println("String: " + ch.toString());// String: A
        System.out.println("Character: " + ch.toString().toLowerCase());// Character: a
        System.out.println("Character: " + ch.toString().toUpperCase());// Character: A

    }
}
