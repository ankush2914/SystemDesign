package SplitwiseSystemDesign;

import SplitwiseSystemDesign.Models.Group;
import SplitwiseSystemDesign.Models.User;
import SplitwiseSystemDesign.Services.BalanceSheetManager;
import SplitwiseSystemDesign.Services.ExpenseManager;
import SplitwiseSystemDesign.Services.SplitManager;

public class Main {
    public static void main(String[] args) {
        SplitManager sm  = new SplitManager();
        BalanceSheetManager bsm = new BalanceSheetManager();
        ExpenseManager em = new ExpenseManager(sm,bsm);
        User u1 = new User(101, "Ankush Verma");
        User u2 = new User(102, "Simran");
        User u3 = new User(103, "Pawan");
        Group g1 = new Group(10001, "Home", em);
        g1.addMember(u3);
        g1.addMember(u1);
        g1.addExpense(100, u3);
        u1.showExpenses();
        g1.addExpense(500, u1);
        u1.showExpenses();
        u3.showExpenses();
        u2.showExpenses();
    }
}
