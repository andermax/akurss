package lv.akurss.lesson1.homework;

import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ваш земной вес (кг): ");
        Double weight=sc.nextDouble();
        System.out.println("Ваш вес на Луне "+weight/100*17);

    }
}
