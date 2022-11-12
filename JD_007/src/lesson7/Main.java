package lesson7;

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard("Pon", 345, 12345678);

        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println();

        creditCard1.setCurrentValue(777777.66);
        creditCard1.setName("YaPomnyu");
        creditCard1.setBankIdentifier(666777666);
        creditCard2.addMoney(56576.96);
        creditCard1.takeOffMoney(888888);

        System.out.println(creditCard1);
        System.out.println(creditCard2);

        System.out.println(creditCard1.getName());
        creditCard1.displayInformation();
        System.out.println();
    }
}