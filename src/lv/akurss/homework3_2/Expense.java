package lv.akurss.homework3_2;

public class Expense {

    Expense (double amount, String category){
        this.amount = amount;
        this.category = category;

    }
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

   private Double amount;
   private String category;
}
