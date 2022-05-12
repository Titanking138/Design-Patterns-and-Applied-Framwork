package ajax;

import java.util.ArrayList;

public class UserIdList {

    private final ArrayList<String> userIdList = new ArrayList<>();

    public ArrayList<String> getList() {
        return userIdList;
    }

    public UserIdList() {
        userIdList.add("arjun@gmail.com");
        userIdList.add("kevla@gmail.com");
        userIdList.add("tarang");
        userIdList.add("rohit");
    }

    public void addId(String userId) {
        userIdList.add(userId);
    }

    public boolean isPresent(String userId) {
        boolean status = false;
        for (String id : userIdList) {
            if (id.compareTo(userId) == 0) {
                status = true;
                break;
            }
        }
        return status;
    }
}
