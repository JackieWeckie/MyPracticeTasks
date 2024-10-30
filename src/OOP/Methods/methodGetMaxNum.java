package OOP.Methods;

public class methodGetMaxNum {
    static int getMaxNum() {
        int num1 = 5;
        int num2 = 10;
        int num3 = 3;
        int num4 = 8;

        int maxNum = num1;

        if (num2 > maxNum) {
            maxNum = num2;
        }

        if (num3 > maxNum) {
            maxNum = num3;
        }
        if (num4 > maxNum) {
            maxNum = num4;
        }

        return maxNum;
    }
}
