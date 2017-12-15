package lv.akurss.lesson1.homework;

import java.util.Scanner;

public class Lex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Один символ: ");
        char symbol=sc.nextLine().charAt(0);
                if (Character.isLetter(symbol)){
                    System.out.println(symbol + " - is Letter");
                }
                else
                    if (Character.isDigit(symbol)) {
                        System.out.println(symbol + " - is Diggit");
                    }
                    else
                        System.out.println(symbol + " - is Decimal");
    }
}
