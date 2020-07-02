package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable {
    // interface with abstract order methods for each icecream type
    // with throw exception specification necessary because implementation
    // of these methods throw this exception.
    Cone orderCone(Cone.Flavor[] balls) throws NoMoreIceCreamException;
    IceRocket orderIceRocket() throws NoMoreIceCreamException;
    Magnum orderMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException;

}
