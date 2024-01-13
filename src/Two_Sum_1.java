import java.util.Scanner;
class Solution{
    public int[] twoSum(int[] nums , int target){
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                if ((nums[i] + nums[j]) == target ){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}
public class Two_Sum_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target=10;
        int[] nums = new int[5];
        for (int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int[] ary = solution.twoSum(nums , target);
        for (int j=0; j<ary.length; j++){
            System.out.println(ary[j]);
        }
    }
}
