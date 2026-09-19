package model;

import java.time.LocalDate;

public class Receipt {
    private String id;
    private Group group;
    private Member member;
    private double receivedAmount;
    private LocalDate receivedDate;
    private Status receiptStatus;

    public Receipt(String id, Group group, Member member, double receivedAmount, LocalDate receivedDate, Status receiptStatus) {
        this.id = id;
        this.group = group;
        this.member = member;
        this.receivedAmount = receivedAmount;
        this.receivedDate = receivedDate;
        this.receiptStatus = receiptStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public double getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(double receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Status getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(Status receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id='" + id + '\'' +
                ", group=" + group +
                ", member=" + member +
                ", receivedAmount=" + receivedAmount +
                ", receivedDate=" + receivedDate +
                ", receiptStatus=" + receiptStatus +
                '}';
    }
}

