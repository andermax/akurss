package lv.akurss.homework3_2;

public class ExpenseCalculator{
    private double totalAmount;
    public void addToExpenses(double expense){
        this.totalAmount += expense;
    }
    public void printTotal(){
        System.out.println(this.totalAmount);
    }
}


//5. В классе ExpenseCalculator создаем метод addToExpenses с аргументом Expense,
// и чтоб при получении Expense этот метод увеличивал поле totalAmount на то значение, что пришло в Expence

//6. В классе ExpenseCalculator создаем метод printTotal который бы распечатывал в консоль значение поля totalAmount