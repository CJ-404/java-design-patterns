package composite;

public class LiquidItem extends Item{
    private double price;
    private final String seller;
    private double volumeInLitre;
    public LiquidItem(double price, String seller)
    {
        this.price= price;
        this.seller= seller;
    }

    @Override
    public String toString()
    {
        return "{\n\tseller:%s,\n\tprice:%f,\n\tvolume:%fL\n}".formatted(seller,price,volumeInLitre);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getSeller() {
        return this.seller;
    }

    public LiquidItem setVolumeInLitre(double volumeInLitre) {
        this.volumeInLitre = volumeInLitre;
        return this;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolumeInLitre(){
        return this.volumeInLitre;
    }
}
