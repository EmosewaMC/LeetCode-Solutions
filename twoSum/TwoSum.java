package twoSum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            list.remove(i);
            if(list.contains(target - temp)) {
                int location = list.indexOf(target - temp) + 1;
                return new int[]{i, location};
            }
            list.add(i, temp);
        }
        return nums;
    }
}