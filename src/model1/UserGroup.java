package model1;

import jakarta.persistence.*;

@Entity
@Table(
        name = "user_group",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"user_id", "group_id"}
                )
        }
)
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @Column(nullable = false, precision = 15, scale = 2)
    private Double balance;
    @Column(nullable = false)
    private boolean received;
    @Column(name = "member_order", nullable = false)
    private Integer userReceivingOrder;


    public UserGroup(User user, Group group, Double balance, boolean receveid, Integer userReceivingOrder) {
        this.user = user;
        this.group = group;
        this.balance = balance;
        this.received = receveid;
        this.userReceivingOrder = userReceivingOrder;
    }

    public UserGroup() {

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
