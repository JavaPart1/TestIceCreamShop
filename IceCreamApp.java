package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

import static be.intecbrussel.eatables.Flavor.PISTACHE;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList pricelistx = new PriceList(0.5,1.2,2.5);

        IceCreamSeller iceSalon = new IceCreamSalon(pricelistx);

        Cone cone1 = ((IceCreamSalon) iceSalon).orderCone(new Flavor[]{PISTACHE, Flavor.MOKKA, Flavor.MOKKA});
        Magnum magnum1 = ((IceCreamSalon) iceSalon).orderMagnum(MagnumType.ALPINENUTS);
        IceRocket iceRock1 = ((IceCreamSalon) iceSalon).orderIceRocket();

        Eatable[] eatables = new Eatable[]{
                cone1,magnum1,iceRock1
        };

        for (int i = 0; i < eatables.length ; i++) {
            eatables[i].eat();

        }

        System.out.println("Profit = " + iceSalon.getProfit());
    }
}
