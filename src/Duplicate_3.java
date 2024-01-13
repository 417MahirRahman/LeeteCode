import java.util.Scanner;
class Solution3{
    public boolean containsDuplicate(int[] nums){
        int count=0;
        int k = nums.length;
        for (int i=0; i<k-1; i++){
            for (int j=i+1; j<k; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

public class Duplicate_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i=0; i< nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        boolean ans = new Solution3().containsDuplicate(nums);
        System.out.println(ans);
    }
}