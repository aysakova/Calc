// 2 digits
// one row
// input EITHER 1,2,3,4... OR I, II, IV... NOT TOGETHER
// input from 1 to 10
// ops: -,+,*,/
// proper numbers
// wrong input (num, ops) --> EXIT

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        double result = 0.0;
        int num1;
        int num2;
        char operator;

        Scanner in = new Scanner(System.in);

        System.out.print("Input: \n ");

        num1 = in.nextInt();
        num2 = in.nextInt();
        operator = in.next().charAt(1);

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;

        }

        System.out.println("Output: \n" + result);
    }
}