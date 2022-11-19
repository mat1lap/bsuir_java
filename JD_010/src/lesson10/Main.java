package JD_010.src.lesson10;

public class Main {
    public static void main(String[] args) {
        ProductContract productContract = new ProductContract("087621", "08.05.2021",
                "Bananas", 1532);
        EmployeeContract employeeContract = new EmployeeContract("456183", "28.09.2010",
                "17.12.2022", "Иванов Иван Иванович");
        FinancialInvoice financialInvoice = new FinancialInvoice("174396", "23.03.2016",
                34822, "980643");
        Register register = new Register();
        register.addDocument(productContract);
        register.addDocument(employeeContract);
        register.addDocument(financialInvoice);
        register.displayDocumentInformation("456183");
        register.displayDocumentInformation("000000");
    }
}
