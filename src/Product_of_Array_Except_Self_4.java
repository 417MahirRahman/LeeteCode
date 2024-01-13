import java.util.Scanner;
class Solution4{
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] array = new int[length];
        array[0] = 1;
        for (int i=1; i< length; i++){
            array[i] = array[i-1] * nums[i-1];
        }
        int right = nums[length-1];
        for (int i= length-2; i>=0; i--){
            array[i] = array[i] * right;
            right = right*nums[i];
        }
        return array;
    }
}
public class Product_of_Array_Except_Self_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i=0; i< nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        int[] array = new Solution4().productExceptSelf(nums);
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
