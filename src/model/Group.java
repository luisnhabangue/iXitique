package model;

import java.time.LocalDate;

public class Group {
    private String id;
    private String name;
    private double monthlyAmount;
    private LocalDate startDate;
    private boolean active;

    public Group(String id, String name, double monthlyAmount, LocalDate startDate, boolean active) {
        this.id = id;
        this.name = name;
        this.monthlyAmount = monthlyAmount;
        this.startDate = startDate;
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(double monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", monthlyAmount=" + monthlyAmount +
                ", startDate=" + startDate +
                ", active=" + active +
                '}';
    }
}
