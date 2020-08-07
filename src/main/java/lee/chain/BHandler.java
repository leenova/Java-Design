package lee.chain;

public class BHandler extends Handler {
    @Override
    public void doHandler(SthEvent event) {
        System.out.println("读取B "+(event != null));
        if(next != null){
            next.doHandler(event);
        }
    }
}
