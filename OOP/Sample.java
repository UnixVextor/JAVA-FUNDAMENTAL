package OOP;
import java.util.Random;
public class Sample {
    String model = "Tesla";   // Global variable 
    int years =2015;
    Random random;

    Sample(String model,int years){   // constructor of the class
        this.model = model; // using this to use variable in this class
        this.years = years;
        random = new Random(); // local variable
        Show(random);
    }

    // overloaded constructor
    Sample(int num){           
        this.years = num;
        System.out.println("this is another : " + this.years);
    }

    void Show(Random random){  // method in class
        System.out.println("Model of this car " + this.model);
        System.out.println("The years of this car " + this.years);
        System.out.println("The random number : "+ random.nextInt());
    }

    /*
        toString() = special method that all object inherit,
                    that returns a string that "textually represents" an object.
                    can be use both implivitly and explicitly
    */
    public String toString(){
        return model;
    }

}