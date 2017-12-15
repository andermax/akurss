package lv.akurss.lesson7.homework;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Введите расход вида amount:name:CATEGORY :");
                String s = scanner.next();
                if (s.equals("quit")) {
                    System.out.println("See you later!");
                    break;
                }

                addExpence(s);
            }
            catch(Exception error){
                System.out.println("Wrong"+error.getMessage()+" pizdec ");
            }

        }

    }

    private static void addExpence(String scan) {
        String string[] = scan.split(":");

        if (string.length != 3){
            throw new IllegalArgumentException(" One line should contain 3 parts, with ':' separator");
        }

            BigDecimal amount = new BigDecimal(string[0]);



        String name = string[1];
        Category category = Category.valueOf(string[2]);

        Expense exp = new Expense(amount, name, category);
        System.out.println("New expense created: " + exp);
    }
}
