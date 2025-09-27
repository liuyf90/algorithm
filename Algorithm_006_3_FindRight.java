import java.util.Arrays;

public class Algorithm_006_3_FindRight {
    // 在有序数组中找>=num最右侧的位置
    public static void main(String[] args) {
        int testTime = 1000;
        int maxSize = 100;
        int maxValue = 1000;
        System.out.println("测试开始！");
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            Arrays.sort(arr);
            int num = (int) (Math.random() * maxValue + 1);
            if (findRight(arr, num) != right(arr, num)) {
                System.out.println("出错了！");
                System.out.println(Arrays.toString(arr));
                System.out.println(num);
            }
        }
        System.out.println("测试结束！");
    }

    // 随机数组
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[maxSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * maxValue + 1);
        }
        return arr;
    }

    // 对数器
    public static int right(int[] sortedArr, int num) {
        for (int i = sortedArr.length-1; i >=0; i--) {
            if (sortedArr[i] <= num) {
                return i;
            }
        }
        return -1;
    }

    public static int findRight(int[] sortedArr, int num) {
        int ans = -1;
        int m, l = 0;
        int r = sortedArr.length - 1;
        while (l <= r) {
            m = (l + r) / 2;
            // 下面的能防止 l+r 越界溢出
            // m= l+(r-l)/2;
            // m = l +(r-l)>>1;
            if (sortedArr[m] <= num) {
                ans= m ; 
                l = m + 1;
            } else {
                r = m - 1;
            }

        }
        return ans;
    }
}
