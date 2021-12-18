package OOP;

public class collect {
    int num = 12;
    String name = "BMW";

    
    void peek(Sample car){
        System.out.println("Model of car : " + car.model);
    }
    void getmodel(){
        System.out.println("Fantastic model");
    }

    /*
        static = modifier. A single copy of variable/method is created and shared
                 The class "own" the staitc member

     */
    static int FavNum = 12;  // static number 
    static void Display(){   // static method
        System.out.println("Your Favorite number is "+FavNum);
    }

}
