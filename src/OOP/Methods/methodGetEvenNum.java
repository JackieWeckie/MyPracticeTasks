package OOP.Methods;

public class methodGetEvenNum {
    public static int getEvenNum() {
        int num = 10;
        int n = 0;

        while (n < num) {
            System.out.println(n);
            n = n + 2;
        }
        return n;
    }
}
