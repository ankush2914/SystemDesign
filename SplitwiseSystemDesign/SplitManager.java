package SplitwiseSystemDesign;

import java.util.ArrayList;
import java.util.List;

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
