package D_WrapperClassPracticeQ;

public class C_EightDigitBin {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String bin = Integer.toBinaryString(a);
        int len = bin.length();
        if(len < 8) {
            for(int i = 0; i < 8 - len; i++) {
                bin = "0" + bin;
            }
        }
        System.out.println(bin);
    }
}
// java C_EightDigitBin.java 16
// 00010000