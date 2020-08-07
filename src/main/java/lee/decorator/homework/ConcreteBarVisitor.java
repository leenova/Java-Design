package lee.decorator.homework;

public class ConcreteBarVisitor extends BaseBar {

    public ConcreteBarVisitor(Bar component) {
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
