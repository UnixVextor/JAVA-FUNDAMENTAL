package OOP_ITF;

public class Main {
    public static void main(String[] args) {
        /* interface =  a template that can be applie to a class.
                        similar to inheritance , but specific what a class has/must do
                        classes can apply more than one interface ,inheritace is limit to 1 supper
        */
        Hawk hawk = new Hawk();
        hawk.hunt();
        fish Fish = new fish();
        Fish.run();
    }
}
