package OOP_polymophism;

import java.util.Scanner;

public class exception{
    public static void main(String[] args) {
        try{
             Scanner scanner = new Scanner(System.in);
            System.out.println("Input num1 : ");
            int num1 = scanner.nextInt();
            System.out.println("Input num2 : ");
            int num2 = scanner.nextInt();
            scanner.close();
            System.out.println("result : " + num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("please Enter number");
        }
        finally{
            System.out.println("Always print");
        }
            
    }

}