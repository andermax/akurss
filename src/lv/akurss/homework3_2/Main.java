package lv.akurss.homework3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //7. В классе Main в методе main создаем новый объект ExpenseCalculator

        ExpenseCalculator calc = new ExpenseCalculator();

        // 8. В классе Main в бесконечном цикле считываем число из консоли
        int i = 0;
        double number;
        Scanner sc = new Scanner(System.in);
        while (i == 0){

            System.out.print("Enter number: ");
            number = sc.nextDouble();



            //9. Получив число, создаем новый объект Expense, записывая в expense.amount то значение, что получили из консоли

            Expense exp = new Expense(number,"default");
                 //10. Подаем новосозданный объект Expense в метод addToExpenses класса ExpenseCalculator

            calc.addToExpenses(exp.getAmount());
            //11. Вызываем метод printTotal класса ExpenseCalculator
            calc.printTotal();

        }
    }
}
