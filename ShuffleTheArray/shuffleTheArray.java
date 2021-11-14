package ShuffleTheArray;

public class shuffleTheArray {
        public int[] shuffle(int[] nums, int n) {
            int[] ans = new int[nums.length];
            for(int i = 0; i * 2 < nums.length ; i++) {
                ans[i * 2] = nums[i];
                ans[i * 2 + 1] = nums[i + n];
            }
            return ans;
        }
    }
