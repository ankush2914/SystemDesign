package SplitwiseSystemDesign.Services;

import SplitwiseSystemDesign.Models.Expense;
import SplitwiseSystemDesign.Models.Split;
import SplitwiseSystemDesign.Models.User;

public class BalanceSheetManager {
    public void updateBalanceSheet(Expense expense){
        User paidBy = expense.getPaidBy();
        paidBy.setTotalPaid(paidBy.getTotalPaid()+expense.getAmount());
        for(Split spilt: expense.getSplits()){
            User u1 = spilt.getUser();
            double amount = spilt.getAmount();
            u1.setTotalShare(u1.getTotalShare()+amount);
            if(u1!=paidBy){
                double a1 = u1.getBalanceSheet().getOrDefault(paidBy, 0.0);
                double a2 = paidBy.getBalanceSheet().getOrDefault(u1, 0.0);
                u1.getBalanceSheet().put(paidBy, a1-amount);
                paidBy.getBalanceSheet().put(u1, a2+amount);

            }
        }   
    }
}
