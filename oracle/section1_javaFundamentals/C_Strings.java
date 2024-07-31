public class C_Strings {
    public static void main(String[] args) {
        //we should not compare strings with == it is for reference equality
        //Strings are immutable (can't be changed)\
        String str1="hello";
        System.out.println(str1.length());//5
        System.out.println(str1.toUpperCase()+" "+str1);//HELLO hello
        //String str2='c';//err : single quotes for char
        String str3;
        //System.out.println(str3);//err
        String str4="string 1"+str1;
        System.out.println(str4.substring(1,9));//tring 1h
    }
}