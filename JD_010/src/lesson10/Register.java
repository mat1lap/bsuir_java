package JD_010.src.lesson10;

import java.util.ArrayList;
import java.util.Objects;

public class Register {
    private ArrayList<Document> documentArrayList = new ArrayList<>();

    public Register() {
    }

    public void addDocument(Document document) {
        for (Document arrayDocument : documentArrayList) {
            if (document == arrayDocument) {
                return;
            }
        }
        documentArrayList.add(document);
    }

    public Document findDocumentByNumber(String documentNumber) {
        for (Document arrayDocument : documentArrayList) {
            if (Objects.equals(documentNumber, arrayDocument.getDocumentNumber())) {
                return arrayDocument;
            }
        }
        return null;
    }

    public void displayDocumentInformation(String documentNumber) {
        if (findDocumentByNumber(documentNumber) != null) {
            findDocumentByNumber(documentNumber).displayDocumentInformation();
        }
    }
}
