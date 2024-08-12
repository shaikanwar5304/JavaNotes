package a_WrapperClass;
//collections work on objects so we use wrapper class for primitive type
//the process of converting the primitive data types into objects is wrapping
public class A_Integer {
	public static void main(String arg[]) {
		Integer i = 10;
		System.out.println(i);//10
		int k = Integer.parseInt("100");
		System.out.println(k);//100  
		k = new Integer("200");//deprecated
		System.out.println(k);//200
		System.out.println(i.intValue());//10
		System.out.println(i.doubleValue());//10.0
		System.out.println(i.floatValue());//10.0
		System.out.println(i.longValue());//10
		System.out.println(i.shortValue());//10
		System.out.println(i.byteValue());//10
		System.out.println(i.toString());//10
		
	}
}
