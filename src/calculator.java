
import java.util.Arrays;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: \n");

        String[] arrOfStr = sc.nextLine().split("(?<=[+*-/])|(?=[+*-/])");
        if (arrOfStr.length != 3) {
            System.err.println("Проверьте правильность ввода, а именно количество введенных переменных и операторов");
            System.exit(8); // array mismatch
        }
        String[] ourNums = {arrOfStr[0], arrOfStr[2]};
        String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] romeForResult = {
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
                "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
                "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"
        };
        int num1;
        int num2;
        String op = arrOfStr[1];
        int result;
        Calculations calc = new Calculations();
        try {
            if ((Integer.parseInt(ourNums[0]) < 11) && (Integer.parseInt(ourNums[0]) > 0)) {
                if ((Integer.parseInt(ourNums[1]) < 11) && (Integer.parseInt(ourNums[1]) > 0)) {
                    num1 = Integer.parseInt(ourNums[0]);
                    num2 = Integer.parseInt(ourNums[1]);
                    result = calc.calculate(num1,num2,op);
                    System.out.println("Output \n" + result);
                } else System.err.print("Ошибка ввода данных");
                System.exit(7);

            } else System.err.print("Ошибка ввода данных");
            System.exit(7);
      } catch (NumberFormatException exception1) {

               if (Arrays.asList(rome).contains(ourNums[0]) && Arrays.asList(rome).contains(ourNums[1])) {
                   num1 = 0;
                   num2 = 0;
                   for (int i = 0; i<10; i++) {
                       if (rome[i].equals(ourNums[0])) {
                           num1 = i + 1;
                       }
                   }
                   for (int i = 0; i<10; i++) {
                       if (rome[i].equals(ourNums[1])) {
                           num2 = i + 1;
                       }
                   }
                   result = calc.calculate(num1,num2,op);
                   String resultString;
                   resultString = Arrays.asList(romeForResult).get(result-1);

                   System.out.println("Output \n" + resultString);
               }
               else {
   System.err.print("Ошибка ввода данных");
   System.exit(5);
               }
        }
    }
}

class Calculations {
    public int calculate(int num1, int num2, String operation) {
        int result = 0;
        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
        }
return result;
    }
}
