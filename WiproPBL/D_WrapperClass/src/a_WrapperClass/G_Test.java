package a_WrapperClass;
// byte→short→int→long→float→double 
// char→int→long→float→double

public class G_Test {
    public void m1(Double x) {
        System.out.println("Double");
    }

    public void m1(long x) {
        System.out.println("long");
    }

    public int m1() {
        System.out.println("No-arg method");
        return 0;
    }

    public static void main(String[] args) {
        int x = 0;
        G_Test t = new G_Test();
        t.m1(x); // This will call m1(long x) //because int is converted to long
        Long l1 = 10L;
        t.m1(l1); // This will call m1(long x)
        t.m1(); // This will call m1() with no arguments
        t.m1(2.3);//Double
        Integer y= 10;
        x =10;
        System.out.println(x==y);//true
    }
}
