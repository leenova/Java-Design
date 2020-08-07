package lee.decorator.normal;


//抽象装饰器 BaseBar 提供子功能的实现的接口 持有具体组件对象
public abstract class Decorator extends Component{

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation(){
        // 转发请求给组件对象，可以再转发前后执行一些附加操作
        component.operation();
    }

}
