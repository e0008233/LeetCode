package day.day.up.questions.algorithms.math.number528;

import java.util.Random;


//这道题给了一个权重数组，让我们根据权重来随机取点，现在的点就不是随机等概率的选取了，而是要根据权重的不同来区别选取。
// 比如题目中例子2，权重为 [1, 3]，表示有两个点，权重分别为1和3，那么就是说一个点的出现概率是四分之一，另一个出现的概率是四分之三。
// 由于我们的rand()函数是等概率的随机，那么我们如何才能有权重的随机呢，我们可以使用一个trick，由于权重是1和3，相加为4，那么我们现在假设有4个点，
// 然后随机等概率取一个点，随机到第一个点后就表示原来的第一个点，随机到后三个点就表示原来的第二个点，这样就可以保证有权重的随机啦。
// 那么我们就可以建立权重数组的累加和数组，比如若权重数组为 [1, 3, 2] 的话，那么累加和数组为 [1, 4, 6]，整个的权重和为6，
// 我们 rand() % 6，可以随机出范围 [0, 5] 内的数，随机到 0 则为第一个点，随机到 1，2，3 则为第二个点，随机到 4，5 则为第三个点，
// 所以我们随机出一个数字x后，然后再累加和数组中查找第一个大于随机数x的数字，使用二分查找法可以找到第一个大于随机数x的数字的坐标，即为所求
class Solution {
    int[] sum;
    Random random;
    int totalWeight;
    public Solution(int[] w) {
        sum =new int[w.length];
        for (int i=0;i<w.length;i++){
            if (i==0){
                sum[i]=w[i];
            }
            else{
                sum[i]=sum[i-1]+w[i];
            }
        }
        this.random = new Random(System.currentTimeMillis());
        totalWeight = sum[w.length-1];
    }

    public int pickIndex() {

        int number = random.nextInt(totalWeight);
        int left=0;
        int right=sum.length-1;


        // binary seach
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sum[mid] <= number) left = mid + 1;
            else right = mid;
        }
        return right;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */