import java.util.Arrays;

public class Algorithm_006_1_FindNumber {



    //对数器
    public static void main(String[] args) {
        int testTime = 1000;
        int maxSize = 100;
        int maxValue = 1000;
        System.out.println("测试开始！");
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            Arrays.sort(arr);
            int num = (int) (Math.random() * maxValue + 1);
            if (binarySearch(arr, num) != right(arr, num)) {
                System.out.println("出错了！");
                System.out.println(Arrays.toString(arr));
                System.out.println(num);
            }
        }
        System.out.println("测试结束！");
    }

    //随机数组
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[maxSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * maxValue + 1);
        }
        return arr;
    }

    //验证器
    public static boolean right(int[] sortedArr, int num) {
        for(int cur: sortedArr) {
            if (cur == num) {
                return true;
            }
        }
        return false; 
    }





    //二分法查询
    //只能用在已排序的数组上
    public static boolean binarySearch(int[] sortedArr, int num) {
        int m=0;
        int r=sortedArr.length-1;
        int l=0;
        while( l <= r) {
           m = (l+r)/2; 
           if(sortedArr[m] == num){
            return true;
        }else if (sortedArr[m]<num) {
            l=m+1;
        }else {
            r= m-1;
        }
        }
        return false;
    }      

    
    
} 