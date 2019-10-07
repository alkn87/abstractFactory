public class ClientAbstractFactory
{
    ClientAbstractFactory(AbstractFactory factory)
    {
        AbstractProductA pa = factory.CreateProductA();
        AbstractProductB pb = factory.CreateProductB();
        pa.run();
        pb.doIt();
    }
    
    public static void main(String args[])
    {
        new ClientAbstractFactory(new ConcreteFactory1());
        new ClientAbstractFactory(new ConcreteFactory2());
    }
}
