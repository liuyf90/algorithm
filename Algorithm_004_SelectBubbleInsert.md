
[选择、冒泡、插入排序
](https://youtu.be/HNwX7I30tpo?si=NrV0ZxbdIEUrIYE3)

### 1. 选择排序
```
5 2 6 1 8                                   1 2 6 5 8
 
          从 0 到 4 位置找到最小值放到 0 位置              从 1 到 4 位置找最小值放入 1 

0 1 2 3 4                                   0 1 2 3 4

```
5 2 6 1 8

1 2 6 5 8

1 2 6 5 8

1 2 5 6 8

1 2 5 6 8

*所谓选择排序，就是每次都选择最小的值往左放*
```java
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
```
### 2. 冒泡排序

2 4 1 5 3    两两相比较，谁大谁往右。

```
2 4 1 5 3                      2 1 4 3 5
   2-4                            2-1
2 4 1 5 3                      1 2 4 3 5
   4-1                            2-4
2 1 4 5 3        最右位置固定    1 2 4 3 5  倒数第二位固定  .....
   4-5                             4-3
2 1 4 5 3                      1 2 3 4 5
   5-3
2 1 4 3 5
```

**所谓冒泡排序，就是从左到右两两比较，大的向右交换**

```java
   // 冒泡排序
     public static void bubbleSort(int[] arr){
        if(arr == null || arr.length <2){
            return;
        }
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
```

### 3. 插入排序

就像给手里的扑克牌排序，抽到的新牌向手里的牌插入到应该的位置。这个叫插入排序.
默认手里的牌已经是有序的了

```
1 4 5 2
1和 4 比较谁小，1 小，停止
1 4 5 2
4 和 5 比较谁小，4 小，停止
1 4 5 2
5 和 2 比较谁小，2 小
1 4 2 5
2 和 4 比较谁小，2 小
1 2 4 5
2 和 1 比较谁小，1 小，停止
```

```java
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
```