package lv.akurss.lesson1.homework;

import java.util.Scanner;

public class Thunder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sec;

        System.out.print("Количество секунд между видимым светом от удара молнии до слышимого звука: ");
        sec = sc.nextInt();

        System.out.print("Расстояние в метрах до удара молнии: "+ sec*330);


    }
}
