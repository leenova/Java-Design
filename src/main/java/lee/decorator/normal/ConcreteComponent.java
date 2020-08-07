package lee.decorator.normal;


public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("初始业务逻辑");
    }
}
