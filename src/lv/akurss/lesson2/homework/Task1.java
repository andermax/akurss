package lv.akurss.lesson2.homework;
import java.util.Scanner;
public class Task1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input int: " );
        int input = scanner.nextInt();

        // 1. Дополните программу, чтоб она выведа "Wow, it's big number!", если вы ввели число больше 1000.
        if (input > 1000) {
            System.out.println("Wow, it's big number!");
        }
        // 2. Дополните программу, чтоб она выводила, какое число вы ввели - четное или нечетное.
        if (input % 2 != 0) {
            System.out.println("Число не четное");
        } else {
            System.out.println("Число четное");

        }
        //3. Дополните программу, чтоб она выводила, какое число вы ввели - положительное, отрицательное или 0.
        if (input > 0) {
            System.out.println("число положительное");
        } else if (input < 0) {
            System.out.println("число отрицательное");
        } else
            System.out.println("число = 0");


        // 4. Дополните программу, чтоб она вывела
        //* "Fizz" - если введенное число делится на 3 без остатка.
        //* "Buzz" - если введенное число делится на 5 без остатка.
        //* "FizzBuzz" - если введенно число делится на 3 без остатка И на 5 без остатка.

        if (input % 3 == 0){
            System.out.println("Fizz");
        }
        if (input % 5 == 0){
            System.out.println("Buzz");
        }
        if ((input %3 == 0) && (input % 5 == 0)){
            System.out.println("FizzBuzz");
        }



    }
}

