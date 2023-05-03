import java.util.Arrays;

public class Assignment4 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] arrCopy1 = Arrays.copyOf(arr, arr.length);
        updateArr(arrCopy1, 3, 10);
        System.out.println(Arrays.toString(arrCopy1));
        System.out.println(Arrays.toString(arr));
    }

    public static void updateArr(int[] arr, int i, int value) {
        arr[i] = value;
    }
    
    public static void swap() {
        
    }
}
