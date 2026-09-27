package model;

import java.util.List;

public class Cycle {
    private int number;
    private Member beneficiary;
    private double totalCollected;
    private List<Contribution> contributions;

    public Cycle(int number, Member beneficiary, double totalCollected, List<Contribution> contributions) {
        this.number = number;
        this.beneficiary = beneficiary;
        this.totalCollected = totalCollected;
        this.contributions = contributions;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Member getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Member beneficiary) {
        this.beneficiary = beneficiary;
    }

    public double getTotalCollected() {
        return totalCollected;
    }

    public void setTotalCollected(double totalCollected) {
        this.totalCollected = totalCollected;
    }

    public List<Contribution> getContributions() {
        return contributions;
    }

    public void setContributions(List<Contribution> contributions) {
        this.contributions = contributions;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "number=" + number +
                ", beneficiary=" + beneficiary +
                ", totalCollected=" + totalCollected +
                ", contributions=" + contributions +
                '}';
    }
}
