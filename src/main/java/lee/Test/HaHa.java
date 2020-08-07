package lee.Test;

public class HaHa {

    public static void haha(){
        System.out.println("haha");
    }

    public static void main(String[] args){
        ((HaHa)null).haha();

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);
    }
}
