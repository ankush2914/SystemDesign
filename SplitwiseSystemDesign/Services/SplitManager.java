package SplitwiseSystemDesign.Services;

import java.util.ArrayList;
import java.util.List;

import SplitwiseSystemDesign.Models.Split;
import SplitwiseSystemDesign.Models.User;

public class SplitManager {
    List<Split> createSplit(List<User>members,double amount){
        List<Split> splits = new ArrayList<>();
        for(User user: members){
            Split split = new Split(user, amount/members.size());
            splits.add(split);
            System.out.println(user.getName() + " "+ amount/members.size());
        }
        return splits;
    }
}
