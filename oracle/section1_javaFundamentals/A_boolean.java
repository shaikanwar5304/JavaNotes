public class A_boolean {
    public static void main(String[] args) {
        boolean x=true;
        boolean y;
        y=(x=false);
        System.out.println(y);//false
        y=(x=true);
        System.out.println(y);//true
    }
}
