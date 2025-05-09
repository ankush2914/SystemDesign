package SplitwiseSystemDesign.Services;

import java.util.*;

import SplitwiseSystemDesign.Models.User;
public class Splitwise {
    ExpenseManager expenseManager;
    public void addExpense(List<User>members, double amount,User paidBy){
        expenseManager.createExpense(members, amount, paidBy);
    }
}
