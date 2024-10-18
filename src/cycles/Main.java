package cycles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getSquare();
        getNonFilledSquare();
        getNonFilledRectangle();
        getSimpleNumbers();
    }

    static void getSquare() {
        System.out.println("Type any number that less than 400, but more than 1 to generate a square: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 2 && num <= 400) {
            System.out.println("\nSquare generated successfully!");
            for (int i = 0; i < num; i++) {
                System.out.println();
                for (int n = 0; n < num; n++) {
                    System.out.print("*");
                }
            }
        } else {
            System.out.println("\nError! You typed a wrong number. Please try again.");
        }
    }

    static void getNonFilledSquare() {
        System.out.println("Type any number that less than 400, but more than 3 to generate a non-filled square: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 3 && num <= 400) {
            System.out.println("\nSquare was generated successfully!");
            for (int i = 0; i < num; i++) {
                System.out.println();
                for (int n = 0; n < num; n++) {
                    if (i == 0 || i == num - 1 || n == 0 || n == num - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        } else {
            System.out.println("\nError! You typed a wrong number. Please try again.");
        }
    }

    static void getNonFilledRectangle() {
        System.out.println("Type any number that less then 400, but more then 3 to generate a non-filled rectangle: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 3 && num <= 400) {
            System.out.println("\nRectangle was generated successfully!");
            for (int i = 0; i < num; i++) {
                System.out.println();
                for (int n = 0; n < num * 2; n++) {
                    if (i == 0 || i == num - 1 || n == 0 || n == num * 2 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        } else {
            System.out.println("\nError! You typed a wrong number. Please try again.");
        }
    }

    static void getSimpleNumbers() {
        System.out.println("Type any numbers to get all the simple numbers in the current float (max 2B): ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isSimple = true;
        int count = 0;

        if (num <= 2_000_000_000 && num >= 0) {
            System.out.println("\nEnjoy your result!:)");
            for (int i = 1; i <= num; i++) {
                isSimple = true;
                for (int n = 2; n < i; n++) {
                    if (i % n == 0) {
                        isSimple = false;
                        break;
                    }
                }
                if (isSimple) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        } else {
            System.out.println("\nError! The max number is 2 billion. Type a lower number.");
        }
    }
}
