
import java.util.Arrays;

public class ArrayTools {
    public static void main(String[] args) {
        //    Array工具类
        int[] arr1 = new int[]{1, 2, 5, 6, 9, 8,};
        int[] arr2 = new int[]{12, 3, 6, 9, 8, 8};

//        Boolean isEqu = Arrays.equals(arr1, arr2);
        boolean isEqu = Arrays.equals(arr1, arr2);
        System.out.println(isEqu);
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

    }
}
