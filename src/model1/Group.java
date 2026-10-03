package model1;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;
    @Column(nullable = false, unique = true)
    private String groupName;
    @Column(nullable = false, length = 50)
    private String groupDescription;
    @Column(nullable = false, precision = 15, scale = 2)
    private Double amountPerUser;
    @Column(name = "payday", nullable = false)
    private Integer payday;
    @Column(name = "createdAt", nullable = false)
    private Date createdAt;

    @OneToOne
    private User createdBy;

    private Date startedAt;

    //private List<User> groupMembers;


    private int frequency;

    public Group() {
    }

    public Group(Long groupId, String groupName, String groupDescription, Double amountPerUser, Integer payday, Date createdAt, User createdBy, Date startedAt, int frequency) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.amountPerUser = amountPerUser;
        this.payday = payday;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.startedAt = startedAt;
        this.frequency = frequency;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public Double getAmountPerUser() {
        return amountPerUser;
    }

    public void setAmountPerUser(Double amountPerUser) {
        this.amountPerUser = amountPerUser;
    }

    public Integer getPayday() {
        return payday;
    }

    public void setPayday(Integer payday) {
        this.payday = payday;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }


    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}

