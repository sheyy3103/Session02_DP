package abstract_factory.factory;

import abstract_factory.en.MaterialType;

public class FurnitureFactory {
    public static FurnitureAbstractFactory getFactory(MaterialType mt) {
        if (mt == MaterialType.Plastic)
            return new PlasticFactory();
        else
        return new WoodFactory();
    }
}
