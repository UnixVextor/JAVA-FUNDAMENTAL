public class Datatype {
    // salary  variable is a private static variable
   private static double salary;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "Development ";

   public static void main(String[] args) {
        byte simple = -20; // byte 8-bit 
        short a = 12; // short integer 16 bit
        int b = 10;  // integer
        int octal = 0114;  // byte,int,long,short can be expressd in octal(base 8)    
        byte hex = 0x64;  // hex(base 16)

        long ll = 11222L; 
        float f = 16.5666f;
        double dd = 11122.22;
        boolean  is_true = true;
        char c = 'B';
        char d = '\u0012';
        String game = "D-ex";
        String game_ = "\u0012"; 


        System.out.println("byte : " + simple);
        System.out.println("short: " + a);
        System.out.println("int  : " + b);
        System.out.println("int  : " + octal);
        System.out.println("byte : " + hex);
        System.out.println("long : " + ll);
        System.out.println("float: " + f);
        System.out.println("double  : " + dd);
        System.out.println("boolean : " + is_true);
        System.out.println("char : " + c);
        System.out.println("char : " + d);
        System.out.println("String : " + game);
        System.out.println("String : " + game_);

        salary = 900; // can access staic variable
        System.out.println(salary);
   } 
}
