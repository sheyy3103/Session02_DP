package abstract_factory.factory;

import abstract_factory.chair.Chair;
import abstract_factory.chair.PlasticChair;
import abstract_factory.table.PlasticTable;
import abstract_factory.table.Table;

public class PlasticFactory extends FurnitureAbstractFactory {
    public Chair createChair() {
        return new PlasticChair();
    }

    public Table createTable() {
        return new PlasticTable();
    }
}
