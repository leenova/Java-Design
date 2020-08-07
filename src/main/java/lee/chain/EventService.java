package lee.chain;

public class EventService {

    public static void doSth(SthEvent event) {
        Handler.Builder builder = new Handler.Builder();
        Handler handler = builder.addHandler(new AHandler()).addHandler(new BHandler()).build();
        handler.doHandler(event);
    }
}
