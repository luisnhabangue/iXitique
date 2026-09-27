package model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    @Column(nullable = false)
    private String groupName;

    @Column(nullable = false)
    private BigDecimal monthlyAmount;

    @Column(nullable = false)
    private LocalDate startDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GroupStatus status;

    @OneToMany(mappedBy = "group")
    private List<Cycle> cycles = new ArrayList<>();

    public Group() {
    }

    public Group(Long id, String name, BigDecimal monthlyAmount,
                 LocalDate startDate, GroupStatus status) {

        this.groupId = id;
        this.groupName = name;
        this.monthlyAmount = monthlyAmount;
        this.startDate = startDate;
        this.status = status;
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

    public BigDecimal getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(BigDecimal monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public GroupStatus getStatus() {
        return status;
    }

    public void setStatus(GroupStatus status) {
        this.status = status;
    }

    public List<Cycle> getCycles() {
        return cycles;
    }

    public void setCycles(List<Cycle> cycles) {
        this.cycles = cycles;
    }
}

