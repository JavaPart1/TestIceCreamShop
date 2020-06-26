package be.intecbrussel.sellers;

import be.intecbrussel.application.NoMoreIceCreamException;
import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller{
    private PriceList pricelist;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    /*private Cone prepareCone(Flavor[] ballsflvrs){
        return ;
    }
    private IceRocket prepareCone(){
        return ;
    }
    private Magnum prepareCone(MagnumType seltype){
        return ;
    }*/

    public Cone orderCone(Flavor[] ballsflvrs) throws NoMoreIceCreamException {
        Cone conex;
        conex = new Cone(ballsflvrs);
        if (this.stock.getBalls() > ballsflvrs.length && this.stock.getCones() > 1) {
            for (int i = 0; i < ballsflvrs.length; i++) {
                this.profit = this.profit + this.pricelist.getBallPrice();

                this.stock.setBalls(this.stock.getBalls()-1);
            }
            this.stock.setCones(this.stock.getCones()-1);
        } else throw new NoMoreIceCreamException("Geen hoorntjes of bollen genoeg !");


        return conex;
    }
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        IceRocket iRock = new IceRocket();
        if (this.stock.getIceRockets() > 1) {
            this.profit = this.profit + this.pricelist.getRocketPrice();
            this.stock.setIceRockets(this.stock.getIceRockets()-1);
        } else throw new NoMoreIceCreamException("Geen icerockets meer !");


        return iRock;
    }
    public Magnum orderMagnum(MagnumType seltype) throws NoMoreIceCreamException {
        Magnum magnx = new Magnum(seltype);
        if (this.stock.getMagni() > 1) {
            this.profit = this.profit + this.pricelist.getRocketPrice();
            this.stock.setMagni(this.stock.getMagni()-1);
        } else throw new NoMoreIceCreamException("Geen magni meer !");

        this.profit = this.profit + this.pricelist.getMagnumPrice(seltype);

        return magnx;
    }

    public double getProfit() {
        return profit;
    }
}
