import java.util.Scanner;
public class D_Scanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);//to initialize scanner
        
        int x;
        float f;
        double d;
        byte b;
        short s;
        boolean bo;
        long l;
        char c;
        String w;
        String str;
        
        System.out.println("please enter a integer:");
        x=sc.nextInt();
        System.out.println("please enter a float:");
        f=sc.nextFloat();
        System.out.println("please enter double:");
        d=sc.nextDouble();
        System.out.println("please enter a boolean:");
        bo=sc.nextBoolean();
        System.out.println("please enter a short: ");
        s=sc.nextShort();
        System.out.println("please enter a long:");
        l=sc.nextLong();
        System.out.println("please enter byte: ");
        b=sc.nextByte();
        System.out.println("please enter a word: ");
        w=sc.next();
        System.out.println("please enter a line: ");
        str=sc.nextLine();
        System.out.println("please enter a string to read third char:");
        c=sc.nextLine().charAt(3);
        
        sc.close();

        System.out.println("word is: "+w);
        System.out.println("line is: "+str);
        System.out.println("float val: "+f);
        System.out.println("int val: "+x);
        System.out.println("double val: "+d);
        System.out.println("long val: "+l);
        System.out.println("boolean val: "+bo);
        System.out.println("short val: "+s);
        System.out.println("byte val: "+b);
        System.out.println("char val: "+c);
    }
}
