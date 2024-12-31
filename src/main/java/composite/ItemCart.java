package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemCart extends Item{
    private final List<Item> items = new ArrayList<>();
    @Override
    public double getPrice() {
//        return items.stream().map((item -> item.getPrice())).reduce(0.0,Double::sum);
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    @Override
    public String getSeller() {
//        return items.stream().map(Item::getSeller).reduce((seller1, seller2) -> seller1 + " , " + seller2).orElse("");
        return items.stream().map(Item::getSeller).collect(Collectors.joining(" , "));
    }

    @Override
    public String toString() {
//        return items.stream().map(Item::toString).collect(Collectors.joining("\n"));
        StringBuilder cartBuilder = new StringBuilder();
        items.forEach(item -> cartBuilder.append(item).append(",\n"));

        // indent to print in json like format
        String indentedCart = cartBuilder.toString().lines().map(line -> "\t"+line).collect(Collectors.joining("\n"));
        return "[\n%s\n]".formatted(indentedCart);
    }

    public void addItem(Item newItem)
    {
        this.items.add(newItem);
    }
    public void removeItem(Item item)
    {
        this.items.remove(item);
    }
}
