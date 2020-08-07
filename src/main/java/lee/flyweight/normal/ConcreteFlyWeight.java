package lee.flyweight.normal;

public class ConcreteFlyWeight implements IFlyWeight{

    private String intrinsicState;


    public ConcreteFlyWeight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("object address: "+System.identityHashCode(this));
        System.out.println("intrinsicState: "+this.intrinsicState);
        System.out.println("extrinsicState: "+extrinsicState);
    }
}
