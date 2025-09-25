import java.util.Arrays;

public class Algorithm_004_SelectBubbleInsert {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 1};
        System.out.println(Arrays.toString(arr));
        //selectionSort(arr);
//        bubbleSort(arr);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // 交换数组中的两个元素
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // 选择排序
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int minIndex, i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                swap(arr, i, minIndex);
            }
        }
    }
     // 冒泡排序
     public static void bubbleSort(int[] arr){
        if(arr == null || arr.length <2){
            return;
        }
        // 从前往后冒泡，对于每一轮，都会将最大的元素冒泡到最后面
        for(int i=arr.length-1; i>0; i--){
            // 从第一个元素开始，往后依次比较，如果前一个元素大于后一个元素，则交换它们的位置
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    // 插入排序
    public static void insertSort(int[] arr){
        if(arr == null || arr.length <2){
            return;
        }
        // 从前往后插入，对于每一轮，都会将最大的元素插入到前面
        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0 && arr[j]>arr[j+1]; j--){
                // 如果前一个元素大于后一个元素，则交换它们的位置
                swap(arr, j, j+1);
            }
        }
    }

}
