package lv.akurss.lesson7.homework;

import java.math.BigDecimal;

public class Expense {
    private BigDecimal amount;
    private String name;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private Category category;

    public Expense(BigDecimal amount, String name, Category category) {
        this.amount = amount;
        this.name = name;
        this.category = category;
    }
}
