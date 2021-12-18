/* 
    consept                     
      primitive                     vs      reference 
       8 types(boolean,byte,etc.)           unlimited (user define)
       stores data                          store address 
       can only hold 1 value                could hold more than 1 value  
       less memory                          more memory 
       fast                                 slower 
    
    
    - variable                  value 
        boolean     1 bit       true and false 
        byte        1 byte      -128 to 127    2'complemant
        short       2 bytes     -32768 to 32767
        int         4 bytes     -2 billion to 2 billion     
        long        8 bytes     -9 quintillion to 9 quintillion
        floaat      4 bytes     fraction number up to 6-7 digits
        double      8 bytes     fraction number up to 15 digits
        char        2 bytes     ex.'a'
        String      varies      ex."hello world"
            
    */
 
//import java.util.Scanner;     // import Scanner frome java libralies
// import java.util.ArrayList;
// import java.util.Random;      // import Random class
import java.util.*;
public class All {
    public static void main(String[] args) {
          int x;   // declaration
          x = 123; // assignment 
          int y = 23; // declaration + assigment = intitialization 
          
          System.out.println("x : " + x);
          System.out.println("y : " + y);

          long ll = 123344455555666L;   // don't forget end up L
          float decimal = 3.14f;        // don't forget end up f  

          System.out.println("ll : " + ll);
          System.out.println("decimal : " + decimal);

         /*
          try (Scanner scanner = new Scanner(System.in)) {   // declaraion Scanner class
            System.out.print("What is your name ? :");
              String name = scanner.next();
              System.out.print("What do you live ?  :");
              String city = scanner.next();
              System.out.print("favourite number ?  :");
              int num = scanner.nextInt();

              System.out.println("name : " + name);
              System.out.println("city : " + city);
              System.out.println("num : " + num);
        }*/

        /*
            expression  = operands & operator
            operands    = values, variable, numbers , quantity
            operator    = +,-,*,/,%
        */
        int odd = 3 + 6;
        odd++;
        float seen;
        seen = (float)odd / 3;   // cast to float 
        System.out.println(seen);
        System.out.println(odd);

        // math class
        double max = 3.14;
        double min = -10;

        System.out.println(Math.max(max,min));  // calling math by Math.nameOffunction 
        System.out.println(Math.min(max,min));
        System.out.println(Math.abs(min));
        System.out.println(Math.sqrt(max));
        System.out.println(Math.round(max));
        System.out.println(Math.ceil(max));
        System.out.println(Math.floor(max));
    
        // Random class
        Random random = new Random();   // create random object from random class
        int rnum = random.nextInt();
        System.out.println("random number : " + rnum);
        System.out.println(random.nextInt(6)); 
        System.out.println(random.nextFloat());
        System.out.println(random.nextBoolean());


        /* 
            Java same this as c++ and c
             - if stament 
             - switch
             - logical 
             - while loop
             - for loop
             - nested loops
        */
        
        // Array 
        String[] cars = {"BMW","camero","Tesla"};   // declaration like C++ both 1D array and 2D array
        cars[0] = "Mustang";
        
        String[] mem = new String[3];               // another declaration in Java 1D array and 2D array
        mem[0] = "camero";
        mem[1] = "cccc";
        mem[2] = "tesla";

        for(int i=0;i<3;i++){
            System.out.print(cars[i]);
            System.out.println(" " + mem[i]);
        }
        
        // String method in Java
        String ex = "Bool";
        System.out.println(ex.equals("Bool"));   // check Sting is same.
        System.out.println(ex.length());         // Length of String
        System.out.println(ex.charAt(3));        // Show character at that index
        System.out.println(ex.indent(0));        // return character at that index
        System.out.println(ex.isEmpty());        // check string emtry
        System.out.println(ex.toUpperCase());    // upperCAse
        System.out.println(ex.toLowerCase());    // lowerCase
        System.out.println(ex.trim());           // delete space in string
        System.out.println(ex.replace('B','b')); // replace some character to other character 


        /*wrapper class  = provide a way to use primitive data type as reference data types
                           reference data type contain useful methods
                           can be use with collections (ex.ArrayList)
        
        primitive       wrapper
        ---------       --------
        boolean         Boolean
        char            Character
        int             Integer
        double          Double

        */
        //Boolean a = true;
        //Character b = '@';
        //Integer c = 123;
        //Double d = 3.12;
        //String e = "Bro";
        
        //  Arraylist like some method vector in c++ 
        /* 
            ArrayList = a resizeable array.
                        Element can be add and removed after compilation phase
                        store only reference data type 
        */    

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");  // add data in array
        food.add("hotdog");

        food.set(0,"sushi"); // chang index with new element
        for (int i = 0; i < food.size(); i++) {   // size() length of array
            System.out.println(food.get(i));      // get element that index 
        }
        //food.remove(0);   // remove data index 0
        //food.clear();     // delete all data in ArratList

        // 2d ArrayList
        ArrayList<ArrayList<String>> burn = new ArrayList<ArrayList<String>>();
        burn.add(food);
        System.out.println(burn.get(0));
        System.out.println(burn.get(0).get(0));

        // for-each loop
        for(String a:food){
            System.out.println(a);
        }

        // using method in main Java
        sample();
        sample("bro");

        // printf function -> like printf in c 
        System.out.printf("bokuwa : %s \n", "name");

        //finale keyword  -> can not change data 
        final int Finals = 122222; 
        System.out.println(Finals);
        
    }
    //Java methood -> when create method has to has static keyword
    static void sample(){
        System.out.println("this is a method");
    }
    
    static void sample(String name){  // overloaded method
        System.out.println("hello " + name);
    }

}
