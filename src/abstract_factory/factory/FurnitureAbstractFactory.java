package abstract_factory.factory;

import abstract_factory.chair.Chair;
import abstract_factory.table.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
}
