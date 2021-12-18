package OOP_ITF;

public class Hawk implements predetor,prey{
    @Override
    public void hunt(){
        System.out.println("i can hunt");
    }
    @Override 
    public void run(){
        System.out.println("i shuld run");
    }
}
