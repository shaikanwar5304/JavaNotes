package a_WrapperClass;

public class D_Others {

	public static void main(String[] args) {
		double d = 10.25;
		Double dObj = d;// Autoboxing
		d= dObj;// Unboxing
		System.out.println("Double: " + dObj);// Double: 10.25
		System.out.println("Double: " + dObj.doubleValue());// Double: 10.25
		dObj = Double.parseDouble("15.75");
		System.out.println("Double: " + dObj);// Double: 15.75
		long l = 100;
		Long lObj = l;
		System.out.println("Long: " + lObj);// Long: 100
		System.out.println("Long: " + lObj.longValue());// Long: 100
		lObj = Long.parseLong("200");
		System.out.println("Long: " + lObj);// Long: 200
		short s = 25;
		Short sObj = s;
		System.out.println("Short: " + sObj);// Short: 25
		System.out.println("Short: " + sObj.shortValue());// Short: 25
		sObj = Short.parseShort("30");
		System.out.println("Short: " + sObj);// Short: 30
		byte b = 5;
		Byte bObj = b;
		System.out.println("Byte: " + bObj);// Byte: 5
		System.out.println("Byte: " + bObj.byteValue());// Byte: 5
		bObj = Byte.parseByte("10");
		System.out.println("Byte: " + bObj);// Byte: 10
		
	}

}
