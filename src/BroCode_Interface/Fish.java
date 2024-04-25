package BroCode_Interface;

public class Fish implements Prey,Predator{
    @Override
    public void flee() {
        System.out.println("Fish is fleeing from larger fish");
    }

    @Override
    public void hunt() {
        System.out.println("Fish is hunting smaller fish");
    }
}
