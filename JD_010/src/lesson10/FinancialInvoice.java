package JD_010.src.lesson10;

public class FinancialInvoice extends Document{
    private int totalMonthAmount;
    private String departmentCode;

    public FinancialInvoice(String documentNumber, String documentDate, int totalMonthAmount, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalMonthAmount = totalMonthAmount;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice() {
    }

    public int getTotalMonthAmount() {
        return totalMonthAmount;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    @Override
    public void displayDocumentInformation() {
        System.out.printf("%s%s%n%s%s%n%s%s%n%s%s%n%s%s", "Type of document: ", "Financial Invoice", "Number of document: ", getDocumentNumber(),
                "Date of document: ", getDocumentDate(),
                "Total amount of month: ", getTotalMonthAmount(),
                "Code of department: ", getDepartmentCode());
    }
}
