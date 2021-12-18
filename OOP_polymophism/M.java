package OOP_polymophism;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        /*
            polymophism = greek word for poly -"many", morph-"form"
                          the ability of an object to identify as more than one type.
         */
        car Car = new car();
        boat Boat = new boat();
        
        vehicle[] racer = {Car,Boat};
        for (vehicle x:racer){
            x.go();
        }


        //Dynamic polymophism = many form of a class after compilation(During runtime)
        Scanner scanner = new Scanner(System.in);
        vehicle vehicle;
        System.out.println("what do you want ? : ");
        System.out.println("(1):car (2):boat");
        int choice = scanner.nextInt();
        scanner.close();
        if(choice == 1){
            vehicle = new car();
            vehicle.go();
        }else if(choice == 2){
            vehicle = new boat();
            vehicle.go();
        }else{
            System.out.println("You input incalid");
        }
    }
}
