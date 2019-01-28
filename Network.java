import java.util.Arrays;
public class Network {
    protected int TOTAL_OPERATOR_COUNT = 5;
    protected String[] OPERATORS = {"+38097", "+38066", "+38050", "+38093", "+38096"};
    protected String[][] PHONES = {
            {"8530430", "4456876", "1298347", "6652345"},
            {"2356897", "3498789"},
            {"2348789"},
            {"1232456", "3452890", "2233444"},
            {"7128812"}
    };

    public boolean isPhoneExist(String operator, String phone) {
        int operatorKey = getOperatorKey(operator);
        if (operatorKey == -1) {
            return false;
        } else {
            if (getPhoneKey(operatorKey, phone) == -1) {
                return false;
            }
            return true;
        }
    }

    private int getOperatorKey(String operator) {
        for(int i=0; i<TOTAL_OPERATOR_COUNT; i++) {
            if (operator.equals(OPERATORS[i])) {
                return i;
            }
        }
        return -1;
    }

    private int getPhoneKey(int operatorKey, String phone) {
        for (int i=0; i<PHONES[operatorKey].length; i++) {
            if (phone.equals(PHONES[operatorKey][i])) {
                return i;
            }
        }
        return -1;
    }
}
