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


        // Abstract class
        Abstraction2 ab = new Abstraction2("BMW",2012,4);
        ab.go();

        /* Access modifire 
            no modifire = can access in the same package
            public  = everybody can access 
            private = can access in the class
            protected = can acess in the same package and subclass
        */

        /*
            Encapsulation = attribute of a class will be hidden or private 
                            can be accessed only through methods (getters & setters)
                            You should make attribute private if you don't have reason to make public/proitected
         */
        System.out.println(ab.getyears());
        ab.setYears(1985);
        System.out.println(ab.getyears());

        // copy object
        Abstraction2 ab2 = new Abstraction2("tesla", 2015, 23);
        Abstraction2 ab3 = new Abstraction2("NNN", 2222, 223);
        //ab3 = ab2;  // same memory adderess
        ab2.copy(ab3);
        System.out.println(ab2.getmodel());
    }
}
