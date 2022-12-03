// 30/11/2022
// https://leetcode.com/problems/single-number/


public class SingleNumber {

    public static void main(String[] args) {
        System.out.println("[2,2,1] = " + singleNumber(new int[]{2,2,1}));
        System.out.println("[4,1,2,1,2] = " + singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println("[4] = " + singleNumber(new int[]{4}));
    }

    public static int singleNumber(int[] nums) {

        int uniqueNum = 0;

        for (int i = 0; i < nums.length; i++) {
            int cont = 0;
            for (int j = nums.length - 1; j >= 0; j--) {
                if (i != j) {
                    if (nums[i] == nums[j]) {
                        break;
                    }
                }
                cont++;
                if (cont == nums.length) {
                    return uniqueNum = nums[i];
                }
            }
        }
        return uniqueNum;
    }
}
