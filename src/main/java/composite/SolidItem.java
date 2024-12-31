package composite;

public class SolidItem extends Item{
    private double price;
    private final String seller;
    private double wightInGrams;

    public SolidItem(double price, String seller){
        this.price = price;
        this.seller = seller;
    }

    @Override
    public String toString()
    {
        return "{\n\tseller:%s,\n\tprice:%f,\n\tweight:%fg\n}".formatted(seller,price,wightInGrams);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getSeller() {
        return this.seller;
    }

    public SolidItem setWightInGrams(double wightInGrams) {
        this.wightInGrams = wightInGrams;
        return this;
    }

    public double getDimension(){
        return this.wightInGrams;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
