package BroCode_Interface;

public class Main {
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        r.flee();
        Hawk h = new Hawk();
        h.hunt();
        Fish f = new Fish();
        f.hunt();
        f.flee();
    }

}
