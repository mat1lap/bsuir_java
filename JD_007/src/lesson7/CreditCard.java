package lesson7;

public class CreditCard {
    private String name;
    private double currentValue;
    private long bankIdentifier;

    public CreditCard() {
    }

    public CreditCard(String name, double currentValue, long bankIdentifier) {
        this.name = name;
        this.currentValue = currentValue;
        this.bankIdentifier = bankIdentifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public long getBankIdentifier() {
        return bankIdentifier;
    }

    public void setBankIdentifier(long bankIdentifier) {
        this.bankIdentifier = bankIdentifier;
    }

    public void addMoney(double moneyAmount) {
        currentValue += moneyAmount;
    }

    public void takeOffMoney(double moneyAmount) {
        if (moneyAmount <= currentValue) {
            currentValue -= moneyAmount;
        } else {
            System.out.println("Idi kupi pelmeney");
        }
    }

    public void displayInformation() {
        System.out.printf("%-20s%s%n%-20s%d%n%-20s%-10.2f%s%n", "Bank name:", name,
                "Bank identifier:", bankIdentifier, "Bank account:", currentValue, "$");
    }
    @Override
    public String toString() {
        return "CreditCard{" +
                "name = '" + name + '\'' +
                ", currentValue = " + currentValue +
                ", bankIdentifier = " + bankIdentifier +
                '}';
    }
}