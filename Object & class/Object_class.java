/* 
     - There can be only one public class per source file
     - The class should be same name of source file 
*/

public class Object_class {
    int puppy_age;

    public Object_class(String name){
        System.out.println("Pass name is: " + name);
    }
    public void setAge(int age){
        puppy_age = age;
    }

    public int getAge(){
        System.out.println("puppy age : " + puppy_age);
        return puppy_age;
    }
    public static void main(String[] args) {
        int GGG;
        GGG = 10;
        System.out.println(GGG);


        Object_class foo = new Object_class("game change");  // declare object and initialize constructor
        foo.puppy_age = 24;
        foo.setAge(12);
        foo.getAge();
        System.out.println(foo.puppy_age);


        Dog puppy = new Dog();
        puppy.color = "brow";
        puppy.variant = "shiba";
        puppy.barking();
        System.out.println(puppy.variant);
        System.out.println(puppy.real);
        System.out.println(puppy.color);
    }
}
