package RichestCustomerWealth;

import java.util.stream.IntStream;

public class richestCustomerWealth {
        public int maximumWealth(int[][] accounts) {
            int maxWealth = 0;
            for(int[] i : accounts) {
                int tempMaxWealth = IntStream.of(i).sum();
                if(tempMaxWealth > maxWealth) {
                    maxWealth = tempMaxWealth;
                }
            }
            return maxWealth;
        }
    }
