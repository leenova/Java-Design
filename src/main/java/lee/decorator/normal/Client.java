package lee.decorator.normal;

public class Client {
    public static void main(String[] args) {

        Component c = new ConcreteComponent();
        System.out.println("_______________A_____________");
        Decorator decoratorA = new ConcreteDecoreatorA(c);
        decoratorA.operation();

        System.out.println("_______________B_____________");
        Decorator decoratorB = new ConcreteDecoreatorB(c);
        decoratorB.operation();

        System.out.println("_______________A and B_____________");
        Decorator decoratorABindB = new ConcreteDecoreatorB(decoratorA);
        decoratorABindB.operation();
    }
}
