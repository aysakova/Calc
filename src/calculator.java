// 2 digits
// one row
// input EITHER 1,2,3,4... OR I, II, IV... NOT TOGETHER
// input from 1 to 10
// ops: -,+,*,/
// proper numbers
// wrong input (num, ops) --> EXIT

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // prompt input
        System.out.print("Input: \n");
        String str = sc.nextLine();

        // pass string into array of chars
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        // parse each char
        double num1 = Integer.parseInt(String.valueOf(ch[0]));
        double num2 = Integer.parseInt(String.valueOf(ch[2]));
        char op = ch[1];

        // loop [1] element to find operator and perform equation
        switch (op) {
            case '+':
                System.out.print((num1 + num2));
                break;
            case '-':
                System.out.print((num1 - num2));
                break;
            case '*':
                System.out.print((num1 * num2));
                break;
            case '/':
                System.out.println((num1 / num2));
                break;
        }
    }
}