package model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "contributions")
public class Contribution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contributionId;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @ManyToOne
    @JoinColumn(name = "cycle_id", nullable = false)
    private Cycle cycle;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ContributionStatus contributionStatus;


    public Contribution() {
    }

    public Contribution(Member member, Group group, Cycle cycle, BigDecimal amount, LocalDate paymentDate, PaymentMethod paymentMethod, ContributionStatus status) {
        this.member = member;
        this.group = group;
        this.cycle = cycle;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.contributionStatus = status;
    }

    public Long getContributionId() {
        return contributionId;
    }

    public void setContributionId(Long contributionId) {
        this.contributionId = contributionId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Cycle getCycle() {
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public ContributionStatus getContributionStatus() {
        return contributionStatus;
    }

    public void setContributionStatus(ContributionStatus contributionStatus) {
        this.contributionStatus = contributionStatus;
    }

    @Override
    public String toString() {
        return "Contribution{" +
                "contributionId=" + contributionId +
                ", member=" + member +
                ", group=" + group +
                ", cycle=" + cycle +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", paymentMethod=" + paymentMethod +
                ", status=" + contributionStatus +
                '}';
    }
}
