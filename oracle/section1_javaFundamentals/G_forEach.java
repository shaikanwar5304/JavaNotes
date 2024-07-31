public class G_forEach {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3},{324,12,1,21}};
        // for (int elem:arr){//Err: can't convert int[] to int
        for(int[] elem: arr){
            System.out.println(elem);
            /*[I@372f7a8d
            [I@2f92e0f4 */
        }
        for (int elem:arr[0]){
            System.out.println(elem);//1 2 3
        }
    }
}