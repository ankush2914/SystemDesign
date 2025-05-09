package SplitwiseSystemDesign;

import java.util.*;

public class User {
    private int id;
    private String name;
    private double totalPaid;
    private double totalShare;
    private Map<User,Double> balanceSheet;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.totalPaid = 0;
        this.totalShare = 0;
        this.balanceSheet = new HashMap<>();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getTotalPaid() {
        return totalPaid;
    }
    public double getTotalShare() {
        return totalShare;
    }
    public Map<User,Double> getBalanceSheet() {
        return balanceSheet;
    }
    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }
    public void setTotalShare(double totalShare) {
        this.totalShare = totalShare;
    }
    public void showExpenses(){
        System.out.println("BalanceSheet of "+this.name);
        for(User user: balanceSheet.keySet()){
            if(balanceSheet.get(user)>0){
                System.out.println(user.getName()+" owes you : "+balanceSheet.get(user)+ "rs.");
            }
            else if(balanceSheet.get(user)<0){
                System.out.println("You owe "+user.getName()+" :"+balanceSheet.get(user)+ "rs.");
            }
        }
    }
}
