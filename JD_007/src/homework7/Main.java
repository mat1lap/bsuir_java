package homework7;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(12386.99, "Pon");
        RAM RAM1 = new RAM("Legend", "Epic", 16);
        HDD HDD1 = new HDD("Rare", 128);
        Computer computer2 = new Computer(123456.99, "Best", HDD1, RAM1);
        System.out.println(computer1);
        System.out.print(computer2);
    }
}
