/*
 Basic syntax 
    - enum 
    - Basic Syntax
*/

class Juice{   // class juice 
    enum Size_juice{SMALL,BIG,ASSS} // stroe constant letter in one variable
    Size_juice size;  // object of enum 
}

public class CH1 {
    public static void main(String[] args) {
        Juice app = new Juice();    // object of class juice 
        app.size = Juice.Size_juice.ASSS; 
        System.out.println("Size: " + app.size);
    }
    
}
