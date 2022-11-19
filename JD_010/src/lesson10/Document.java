package JD_010.src.lesson10;

import java.time.LocalDate;

public abstract class Document {
    private String documentNumber;
    private LocalDate documentDate;

    public Document(String documentNumber, String documentDate) {
        this.documentNumber = documentNumber;
        String[] documentDateArr = documentDate.split("\\.");
        this.documentDate = LocalDate.of(Integer.parseInt(documentDateArr[2]),
                Integer.parseInt(documentDateArr[1]), Integer.parseInt(documentDateArr[0]));
    }

    public Document() {
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public abstract void displayDocumentInformation();
}
