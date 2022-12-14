package product_info;

public class Price implements Comparable<Price>{
    String storeName ;
    String productName;
    int productValue;

    public Price(String storeName, String productName, int productValue) {
        this.storeName = storeName;
        this.productName = productName;
        this.productValue = productValue;
    }

    public String getStoreName() {
        return storeName;
    }
    public String getProductName() {
        return productName;
    }
    public int getProductValue() {
        return productValue;
    }

    @Override
    public String toString() {
        return "Название магазина: " + this.storeName + "; " +
                "Название товара: " + this.productName+ "; " +
                "Стоимость товара в гривнах: " + this.productValue + '\n';
    }

    @Override
    public int compareTo(Price o) {
        return this.storeName.compareTo(o.getStoreName());
    }
}
