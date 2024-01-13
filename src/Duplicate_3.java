import java.util.Scanner;
import java.util.HashSet;
class Solution3{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i< nums.length; i++){
            if (hashSet.contains(nums[i])){
                return true;
            }
            hashSet.add(nums[i]);
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