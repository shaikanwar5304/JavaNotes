package a_WrapperClass;

public class E_TypeConv {

	public static void main(String[] args) {
		int i = 100;
		long l = i;
		float f = l;
		System.out.println("Int: " + i);// Int: 100
		System.out.println("Long: " + l);// Long: 100
		System.out.println("Float: " + f);// Float: 100.0
		byte b = 12;
		short s = b;
		//Integer l1 = b;// Error : Type mismatch: cannot convert from byte to Integer
		//Integer l2 = (Integer)b;// Error : Type mismatch: cannot convert from byte to Integer
		Integer l3 = (int)b;// No Error

	}

}
