package SplitwiseSystemDesign;

import java.util.*;
public class ExpenseManager {
    SplitManager splitManager;
    List<Expense> expenseList;
    BalanceSheetManager balanceSheetManager;
    public ExpenseManager(SplitManager splitManager, BalanceSheetManager balanceSheetManager) {
        this.splitManager = splitManager;
        this.expenseList = new ArrayList<>();
        this.balanceSheetManager = balanceSheetManager;
    }
    public Expense createExpense(List<User>members, double amount, User paidBy){
        List<Split> splits = splitManager.createSplit(members, amount);
        Expense expense = new Expense(splits, paidBy, amount);
        System.out.println("Expense created!");
        balanceSheetManager.updateBalanceSheet(expense);
        expenseList.add(expense);
        return expense;
    }
}
