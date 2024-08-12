package a_WrapperClass;

public class C_BooleanFloat {
	public static void main(String[] args) {
        boolean b = true;
        Boolean bool = b;
        String boolStr = "true";
        Boolean bool2 = Boolean.parseBoolean(boolStr);
        System.out.println("Boolean: " + bool);// Boolean: true
        System.out.println("Boolean: " + bool.booleanValue());// Boolean: true
        System.out.println("Boolean: " + bool.compareTo(false));// Boolean: 1
        System.out.println("Boolean: " + bool.equals(true));// Boolean: true
        float f = 1.0f;
        Float fl = f;
        String flStr = "1.0";
        Float fl2 = Float.parseFloat(flStr);
        System.out.println("Float: " + fl);// Float: 1.0
        System.out.println("Float: " + fl.floatValue());// Float: 1.0
        
    }
}
