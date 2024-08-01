package solutions.day7;

// 55. Jump Game
// https://leetcode.com/problems/jump-game/
public class JumpGame {
    public boolean canJump(int[] nums) {
        int index = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= index-i) {
                index = i;
            }
        }
        if (index == 0) return true;
        return false;
    }
}
