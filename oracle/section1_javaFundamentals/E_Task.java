import java.util.*;
public class E_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your lucky number: ");
        int l=sc.nextInt();
        if (l==7){
            System.out.println("lucky");
        }else if(l==13){
            System.out.println("that's unlucky");
        }else {
            System.out.println("neither lucky nor unlucky");
        }
        sc.close();
    }
}
