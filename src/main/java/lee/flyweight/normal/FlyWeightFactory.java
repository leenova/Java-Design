package lee.flyweight.normal;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private static Map<String,IFlyWeight> pool = new HashMap<>();
    public static IFlyWeight getFlyWeight(String intrinsicState){
        if(!pool.containsKey(intrinsicState)){
            IFlyWeight flyWeight = new ConcreteFlyWeight(intrinsicState);
            pool.put(intrinsicState,flyWeight);
        }
        return pool.get(intrinsicState);
    }


}
