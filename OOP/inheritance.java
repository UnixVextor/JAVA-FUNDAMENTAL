package OOP;
// inheritance is subclass of collect 
public class inheritance extends collect {
    int wall = 456789;

    /*  method overriding = Declaring a method in subclass,
                            which is already present class.
                            done sos that a child class can give its own implementation
    
    */
    @Override
    void getmodel(){
        System.out.println("is not good model");
    }
    
    /* super  = keyword refers to the superclass(parent) of an object
                very similar to the "this" keyword
    
    */
    void test(){
        
        this.wall = 12;
        // this.num = 56;
        // this.name = "Jaden";
        super.name = "BBBU";
        super.num = 23;
        System.out.println(super.name + '\n' + super.num);
        super.getmodel();
    }
}
