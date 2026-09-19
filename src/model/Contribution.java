package model;

import java.time.LocalDate;

public class Contribution {
    private String id;
    private Member member;
    private Group group;
    private double amount;
    private LocalDate paymentDate;
    private PaymentMethod paymentMethod;
    private Status status;

    public Contribution(String id, Member member, Group group, double amount, LocalDate paymentDate, PaymentMethod paymentMethod, Status status) {
        this.id = id;
        this.member = member;
        this.group = group;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Contribution{" +
                "id='" + id + '\'' +
                ", member=" + member +
                ", group=" + group +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", paymentMethod=" + paymentMethod +
                ", status=" + status +
                '}';
    }
}

