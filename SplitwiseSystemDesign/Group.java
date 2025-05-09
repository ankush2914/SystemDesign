package SplitwiseSystemDesign;

import java.util.*;
public class Group {
    private List<User> members;
    private int id;
    private String name;
    List<Expense>expenseList;
    ExpenseManager expenseManager;
    public Group(int id, String name, ExpenseManager expenseManager) {
        this.id = id;
        this.name = name;
        this.expenseList = new ArrayList<>();
        this.members = new ArrayList<>();
        this.expenseManager = expenseManager;
    }
    public void addMember(User user){
        members.add(user);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    void addExpense(double amount, User paidBy){
        Expense expense = expenseManager.createExpense(members, amount, paidBy);
        expenseList.add(expense);
    }
}
