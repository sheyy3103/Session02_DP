package abstract_factory.run;

import abstract_factory.en.MaterialType;
import abstract_factory.factory.FurnitureAbstractFactory;
import abstract_factory.factory.FurnitureFactory;

public class Client {
    public static void main(String[] args) {

        System.out.println();

        FurnitureAbstractFactory plasticFactory = FurnitureFactory.getFactory(MaterialType.Plastic);
        FurnitureAbstractFactory woodFactory = FurnitureFactory.getFactory(MaterialType.Wood);

        plasticFactory.createChair().create();
        woodFactory.createTable().create();
    }
}
