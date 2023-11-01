package model;

public class Payment {
    private String accFrom;
    private String accTo;
    private double amount;

    public Payment(String accFrom, String accTo, double amount) {
        this.accFrom = accFrom;
        this.accTo = accTo;
        this.amount = amount;
    }

    public String getAccFrom() {
        return accFrom;
    }

    public void setAccFrom(String accFrom) {
        this.accFrom = accFrom;
    }

    public String getAccTo() {
        return accTo;
    }

    public void setAccTo(String accTo) {
        this.accTo = accTo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
