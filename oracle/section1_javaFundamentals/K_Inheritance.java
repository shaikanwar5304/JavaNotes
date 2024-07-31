class SuperClass{
    SuperClass(){
        System.out.println("SuperClass");
    }
    void func(){
        System.out.println("functional method");
    }
}
class SubClass extends SuperClass{
    SubClass(){
        System.out.println("SubClass");
    }
    void func2(){
        System.out.println("Functional method 2");
    }
}
public class K_Inheritance {
    public static void main(String[] args) {
        SubClass subObj=new SubClass();
        subObj.func();
        subObj.func2();
    }
}