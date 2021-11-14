package FinalValueofVariableAfterPerformingOperations;

public class finalValueOfVariableAfterPerformingOperations {
        public int finalValueAfterOperations(String[] operations) {
            int result = 0;
            for(String action : operations) {
                if(action.equals("X++") || action.equals("++X")) {
                    result++;
                }else {
                    result--;
                }
            }
            return result;
        }
    }
