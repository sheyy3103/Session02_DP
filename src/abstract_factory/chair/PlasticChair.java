package abstract_factory.chair;

public class PlasticChair implements Chair{
    @Override
    public void create() {
        System.out.println("Creating a new plastic chair...");
    }
}
