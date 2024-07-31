public class F_while {
    public static void main(String[] args) {
        int x=3;
        while (x>0){
            System.out.println(x);//3 2 1
            x--;
        }
        do{
            System.out.println(x);//0
            x--;
        }while(x>0);
    }
}
