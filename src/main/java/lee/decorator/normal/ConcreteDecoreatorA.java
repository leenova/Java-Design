package lee.decorator.normal;

public class ConcreteDecoreatorA  extends Decorator{

    public ConcreteDecoreatorA(Component component) {
        super(component);
    }

    private void opFirst(){
        System.out.println("执行前A增强");
    }
    private void opLast(){
        System.out.println("执行后B增强");
    }

    public void operation(){
        opFirst();
        super.operation();
        opLast();
    }

}
