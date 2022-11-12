package homework7;

public class Computer {
    private double price;
    private String model;
    private homework7.HDD HDD;
    private homework7.RAM RAM;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(double price, String model, HDD HDD, RAM RAM) {
        this.price = price;
        this.model = model;
        this.HDD = HDD;
        this.RAM = RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HDD getHDD() {
        return HDD;
    }

    public void setHDD(HDD HDD) {
        this.HDD = HDD;
    }

    public RAM getRAM() {
        return RAM;
    }

    public void setRAM(RAM RAM) {
        this.RAM = RAM;
    }

    public void displayInformation() {
        System.out.printf("%-20s%f%n%-20s%s%n",
                "Price:", price, "Model:", model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", HDD=" + HDD +
                ", RAM=" + RAM +
                '}';
    }
}
