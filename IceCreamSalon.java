package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller{
    private PriceList pricelist;
    private double totalProfit;

    public IceCreamSalon(PriceList pricelist) {

        this.pricelist = pricelist;
        this.totalProfit = 0;
    }

    public Cone orderCone(Flavor[] ballsflvrs){
        Cone conex;
        conex = new Cone(ballsflvrs);

        for (int i = 0; i < ballsflvrs.length; i++) {
            this.totalProfit = this.totalProfit + this.pricelist.getBallPrice();

        }

        return conex;
    }
    public IceRocket orderIceRocket(){
        IceRocket iRock = new IceRocket();

        this.totalProfit = this.totalProfit + this.pricelist.getRocketPrice();

        return iRock;
    }
    public Magnum orderMagnum(MagnumType seltype){
        Magnum magnx = new Magnum(seltype);

        this.totalProfit = this.totalProfit + this.pricelist.getMagnumPrice(seltype);

        return magnx;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "pricelist=" + pricelist +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
