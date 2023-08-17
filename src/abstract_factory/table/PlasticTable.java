package abstract_factory.table;

public class PlasticTable implements Table{
    @Override
    public void create() {
        System.out.println("Creating a new plastic table...");
    }
}
