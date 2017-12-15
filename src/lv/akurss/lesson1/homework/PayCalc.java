package lv.akurss.lesson1.homework;

import java.util.Scanner;

public class PayCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double mounthPay;

        System.out.println("Insert mounth pay: ");
        mounthPay=sc.nextDouble();
        System.out.println(1000000/mounthPay/12+" years");


    }
}
