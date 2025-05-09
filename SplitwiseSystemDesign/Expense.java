package SplitwiseSystemDesign;

import java.util.*;
public class Expense {
    private List<Split> splits;
    private User paidBy;
    private double amount;
    public Expense(List<Split> splits, User paidBy, double amount) {
        this.splits = splits;
        this.paidBy = paidBy;
        this.amount = amount;
    }
    public List<Split> getSplits() {
        return splits;
    }
    public User getPaidBy() {
        return paidBy;
    }
    public double getAmount() {
        return amount;
    }
}
