package DailyTemperatures;

import java.util.Stack;

public class dailyTemperatures {
    public int[] daysToTemp(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] daysToTemp = new int[temperatures.length];
        for(int i = temperatures.length - 1; i >= 0; i--) {
            while(!stack.empty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if(stack.empty()) {
                daysToTemp[i] = 0;
            } else {
                daysToTemp[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return daysToTemp;
    }
}
