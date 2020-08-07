package lee.decorator.homework;

public class ConcreteBarVip extends BaseBar {

    public ConcreteBarVip(Bar component) {
        super(component);
    }

    private void opFirst(){
        System.out.println("执行前B增强");
    }
    private void opLast(){
        System.out.println("执行后B增强");
    }

    public void operation(){
        // 调用父类方法可以在调用前后执行附加操作
        opFirst();
        super.operation();
        opLast();
    }

}
