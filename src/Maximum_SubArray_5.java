import java.util.Scanner;
class Solution5{
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int Sum=nums[0];
        int Max, MaxSubAry=nums[0];
        for (int i=1; i<n; i++){
            Sum = Sum + nums[i];
            Max = Math.max(Sum,nums[i]);
            Sum = Max;
            MaxSubAry = Math.max(MaxSubAry , Max);
        }
        return MaxSubAry;
    }
}
public class Maximum_SubArray_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i=0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        int sum = new Solution5().maxSubArray(nums);
        System.out.println(sum);

    }
}
