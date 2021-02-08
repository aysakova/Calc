// 2 digits
// one row
// input EITHER 1,2,3,4... OR I, II, IV... NOT TOGETHER
// input from 1 to 10
// ops: -,+,*,/
// proper numbers
// wrong input (num, ops) --> EXIT

import java.util.Arrays;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: \n");
        String str = sc.nextLine();
        String[] arrOfCharss = str.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        int num1 = Integer.parseInt(arrOfCharss[0]);
        int num2 = Integer.parseInt(arrOfCharss[2]);
        String op = arrOfCharss[1];

        int result = 0;
        Calculate calc = new Calculate(num1, num2);
        switch (op) {
            case "+" : result = calc.add();
            break;
            case "-" : result = calc.sub();
            break;
            case "*" : result = calc.mul();
            break;
            case "/" : result = calc.div();
            break;
        }

        System.out.println("Output \n" + result);


        System.out.print("Output: \n");
    }
}
class Calculate {
        int a, b;
        Calculate(int a, int b) {
            this.a = a;
            this.b = b;
        }
        int add() { return a+b; }
        int sub() { return a-b; }
        int mul() { return a*b; }
        int div() { return a/b; }
}