package JD_010.src.lesson10;

public class ProductContract extends Document{
    private String productType;
    private int productAmount;

    public ProductContract(String documentNumber, String documentDate, String productType, int productAmount) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.productAmount = productAmount;
    }

    public ProductContract() {
    }

    public String getProductType() {
        return productType;
    }

    public int getProductAmount() {
        return productAmount;
    }

    @Override
    public void displayDocumentInformation() {
        System.out.printf("%s%s%n%s%s%n%s%s%n%s%s%n%s%s", "Type of document: ", "Product contract", "Number of document: ", getDocumentNumber(),
                "Date of document: ", getDocumentDate(),
                "Type of product: ", getProductType(),
                "Amount of product: ", getProductAmount());
    }
}
