package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

import static be.intecbrussel.eatables.Flavor.PISTACHE;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList pricelistx = new PriceList(0.5,1.2,2.5);
        Stock stockx = new Stock(5,6,20,5);

        IceCreamSeller icecar = new IceCreamCar(pricelistx,stockx);

        try {
            if (icecar instanceof IceCreamCar){
                Cone cone1 = ((IceCreamCar) icecar).orderCone(new Flavor[]{PISTACHE, Flavor.MOKKA, Flavor.MOKKA});
                Magnum magnum1 = ((IceCreamCar) icecar).orderMagnum(MagnumType.ROMANTICSTRAWBERRIES);
                IceRocket iceRock1 = ((IceCreamCar) icecar).orderIceRocket();
                IceRocket iceRock2 = ((IceCreamCar) icecar).orderIceRocket();

                Eatable[] eatables = new Eatable[]{
                        cone1,magnum1,iceRock1,iceRock2

                };

                for (int i = 0; i < eatables.length ; i++) {
                    eatables[i].eat();

                }

            };


        } catch (NoMoreIceCreamException ex1){
            System.out.println(ex1.getMessage());
        }
        System.out.println(stockx.toString());
        System.out.println("Profit = " + icecar.getProfit());

    }

}
