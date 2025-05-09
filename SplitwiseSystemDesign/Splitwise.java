package SplitwiseSystemDesign;

import java.util.*;
public class Splitwise {
    ExpenseManager expenseManager;
    public void addExpense(List<User>members, double amount,User paidBy){
        expenseManager.createExpense(members, amount, paidBy);
    }
}
