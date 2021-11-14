package DailyTemperatures;

import java.util.Stack;

public class dailyTemperatures {
    public int[] daysToTemp(int[] temperatures) {
        Stack<Integer> monotonicStack = new Stack<Integer>();
        int[] daysToTemp = new int[temperatures.length];
        for(int i = temperatures.length - 1; i >= 0; i--) {
            while(!monotonicStack.empty() && temperatures[i] >= temperatures[monotonicStack.peek()]) {
                monotonicStack.pop();
            }
            if(monotonicStack.empty()) {
                daysToTemp[i] = 0;
            } else {
                daysToTemp[i] = monotonicStack.peek() - i;
            }
            monotonicStack.push(i);
        }
        return daysToTemp;
    }
}
