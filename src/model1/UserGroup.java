package model1;

public class UserGroup {

    private User user;
    private Group group;
    private Double balance;
    private boolean received;
    private Integer userReceivingOrder;

    public UserGroup(User user, Group group, Double balance, boolean receveid, Integer userReceivingOrder) {
        this.user = user;
        this.group = group;
        this.balance = balance;
        this.received = receveid;
        this.userReceivingOrder = userReceivingOrder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public boolean isReceveid() {
        return received;
    }

    public void setReceveid(boolean receveid) {
        this.received = receveid;
    }

    public Integer getUserReceivingOrder() {
        return userReceivingOrder;
    }

    public void setUserReceivingOrder(Integer userReceivingOrder) {
        this.userReceivingOrder = userReceivingOrder;
    }
}
