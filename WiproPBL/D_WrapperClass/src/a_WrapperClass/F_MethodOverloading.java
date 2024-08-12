package a_WrapperClass;

class A{
	int add(int a,int b) {return 0;}
	String add () {
		return "dsf";
	}
	
}
class B extends A{
	float add(float a) {
		return 3.0f;
	}
	
}

public class F_MethodOverloading {
    
    static int add(int a, int b) {
        return a + b;
    }
    static float add(float a, float b) {
        return a + b;
    }
    static int add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
    public static void main(String[] args) {
        System.out.println(add("10", "20"));//30
        System.out.println(add(10, 20));//30
        B x = new B();
    }
}
