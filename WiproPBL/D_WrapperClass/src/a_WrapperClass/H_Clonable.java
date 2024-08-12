package a_WrapperClass;

class A_Class implements Cloneable{
    int a;
    int b;
     A_Class(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
public class H_Clonable {
    public static void main(String[] args) {
        A_Class a = new A_Class(3,4);
        try{
            A_Class b = (A_Class) a.clone();//creates a new object same as a
            //usually when b = a then both are refering to same obj
            System.out.println(b.a + " " + b.b);//3 4
        }catch(CloneNotSupportedException e) {
            System.out.println("Cloning not allowed");
        }
    }
}
