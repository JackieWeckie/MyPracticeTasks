package OOP.Methods;

public class methodGetSimpleNum {
    static int getSimpleNum() {
        boolean isSimple = true;
        int num = 0;
        for (int i = 2; i < 55; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                }
            }
            if (isSimple) {
                System.out.print(i + " ");
            } else {
                isSimple = true;
            }
        }
        return num;
    }
}
