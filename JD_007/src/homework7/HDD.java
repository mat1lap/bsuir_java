package homework7;

public class HDD {
    private String name;
    private double size;

    public HDD(String name, double volume) {
        this.name = name;
        this.size = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
