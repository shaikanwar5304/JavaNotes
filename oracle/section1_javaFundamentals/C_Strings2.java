public class C_Strings2 {
    public static void main(String[] args) {
        // as we know string is non primitive i.e stored in heap
        // i.e "anwar" is stored in heap while the reference (like address) will be in stack memory
        String s1="anwar";
        String s2="an"+"war";
        String s3=new String("anwar");

        System.out.println(System.identityHashCode(s1));//925858445
        System.out.println(System.identityHashCode(s2));//925858445
        System.out.println(System.identityHashCode(s3));//798154996
        //== compares the data in stack i.e adress here
        //.equals checks the strings
        System.out.println(s1==s2);//true
        System.out.println(s2.equals(s1));//true
        System.out.println(s3==s1);//false
        System.out.println(s3.equals(s1));//true

        //compare to will return lexicographic difference
        String s4="Anwar";
        System.out.println(s1.equalsIgnoreCase(s4));//true
        System.out.println(s1.compareTo(s4));//32
        System.out.println(s4.compareTo(s1));//-32
        System.out.println(s1.compareToIgnoreCase(s4));//0
        System.out.println(s1.compareToIgnoreCase(s4));//0
        String s5="abc";
        String s6="bbc";
        String s7="bbcb";
        System.out.println(s5.compareTo(s7));//-1(a-b)
        System.out.println(s5.compareTo(s6));//-1
        System.out.println(s6.compareTo(s7));//-1
    }
}
