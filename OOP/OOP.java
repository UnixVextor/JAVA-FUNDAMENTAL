package OOP;
public class OOP {
    public static void main(String[] args) {
        Sample car1 = new Sample("cheverolet",1988);
        System.out.println(car1.model);
        System.out.println(car1.years);
        //car1.Show();

        Sample car2 = new Sample("Tesla",2015);
        System.out.println(car2.toString()); // toString() 

        // Array of object 
        /*Sample[] allcar = new Sample[2];
        allcar[0] = car1;
        allcar[1] = car2;*/
        Sample[] allcar = {car1,car2}; // Another way defind array of object 
        System.out.println(allcar[0].model);
        System.out.println(allcar[1].model);
    
        // object passing 
        collect collection = new collect();
        collection.peek(car1);
        collection.peek(car2);

        // Access static variable/method
        System.out.println("num : " + collect.FavNum);
        collect.Display();

        // Acees subclass
        inheritance inher = new inheritance();
        System.out.println(inher.wall);
        inher.peek(car1);
        
        inher.getmodel();  // method overriding
        collection.getmodel(); // parent class 

        // super Access
        inher.test();

    }
}
