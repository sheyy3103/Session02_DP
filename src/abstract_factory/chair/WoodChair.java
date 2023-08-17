package abstract_factory.chair;

public class WoodChair implements Chair{
    @Override
    public void create() {
        System.out.println("Creating a new wood chair...");
    }
}
