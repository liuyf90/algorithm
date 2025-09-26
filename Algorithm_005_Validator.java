import java.util.Arrays;

public class Algorithm_005_Validator {

    public static void main(String[] args) {
        int testTime = 100;
        int maxSize = 100;
        int maxValue = 500;
        System.out.println("测试开始！");
         for (int i = 0; i < testTime; i++) {
             int n = (int)(Math.random()*maxSize);
            int[] arr = generateRandomArray(n, maxValue);
            int[] arr1 = copyArray(arr);
            int[] arr2 = copyArray(arr);
            int[] arr3 = copyArray(arr);
            Algorithm_004_SelectBubbleInsert.selectionSort(arr1);
            Algorithm_004_SelectBubbleInsert.bubbleSort(arr2);
            Algorithm_004_SelectBubbleInsert.insertSort(arr3);
            
            if (!isEqual(arr1, arr2)|| !isEqual(arr1, arr3)) {
                System.out.println("出错了！");
                System.out.println(Arrays.toString(arr));
                System.out.println(Arrays.toString(arr1));
                System.out.println(Arrays.toString(arr2));
                System.out.println(Arrays.toString(arr3));
            }
        }
        System.out.println("测试结束！");
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[maxSize];
        // Math.random() -> double -> [0,1) 一个小数, 0.37463473126, 0.001231231
        // Math.random() * v -> double -> [0,v) 一个小数，依然等概率
        // (int)(Math.random() * v) -> int -> 0 1 2 3 ... v-1, 等概率的!
        // (int)(Math.random() * v) + 1 -> int -> 1 2 3 .... v, 等概率的!

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * maxValue + 1);
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
