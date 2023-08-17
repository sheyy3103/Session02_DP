package abstract_factory.factory;

import abstract_factory.chair.Chair;
import abstract_factory.chair.WoodChair;
import abstract_factory.table.Table;
import abstract_factory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
    public Chair createChair() {
        return new WoodChair();
    }

    public Table createTable() {
        return new WoodTable();
    }
}
