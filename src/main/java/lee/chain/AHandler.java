package lee.chain;

public class AHandler extends Handler {
    @Override
    public void doHandler(SthEvent event) {
        System.out.println("读取A "+(event != null));
        if(next != null){
            next.doHandler(event);
        }
    }
}
