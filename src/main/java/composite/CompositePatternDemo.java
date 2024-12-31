package composite;

import common.PatternDemo;

public class CompositePatternDemo implements PatternDemo {
    @Override
    public void run() {
        ItemCart cart = ItemCart.getInstance(); // used singleton lazy pattern

        cart.addItem(new LiquidItem(4000.00,"Mendis.pvt.ltd").setVolumeInLitre(1.5));
        cart.addItem(new LiquidItem(3200.00,"DCSL.pvt.ltd").setVolumeInLitre(1.5));

        cart.addItem(new SolidItem(500.00,"Singithi Bites").setWightInGrams(250));
        cart.addItem(new SolidItem(2200.00,"Mahinda Chicken Farms").setWightInGrams(2000));

        System.out.println(cart.getSeller());
        System.out.println(cart.getPrice());

        System.out.println(cart);
    }
}
