package JD_010.src.lesson10;

import java.time.LocalDate;

public class EmployeeContract extends Document{
    private LocalDate dateOfContractEnding;
    private String employeeName;

    public EmployeeContract(String documentNumber, String documentDate, String dateOfContractEnding, String employeeName) {
        super(documentNumber, documentDate);
        String[] documentDateArr = dateOfContractEnding.split("\\.");
        this.dateOfContractEnding = LocalDate.of(Integer.parseInt(documentDateArr[2]),
                Integer.parseInt(documentDateArr[1]), Integer.parseInt(documentDateArr[0]));
        this.employeeName = employeeName;
    }

    public EmployeeContract() {
    }

    public LocalDate getDateOfContractEnding() {
        return dateOfContractEnding;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public void displayDocumentInformation() {
        System.out.printf("%s%s%n%s%s%n%s%s%n%s%s%n%s%s", "Type of document: ", "Employee contract", "Number of document: ", getDocumentNumber(),
                "Date of document: ", getDocumentDate(),
                "Date of contract ending: ", getDateOfContractEnding(),
                "Name of employee: ", getEmployeeName());
    }
}
