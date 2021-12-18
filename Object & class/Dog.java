public class Dog {
    String variant; //instant variable
    private int age;   // private variable can use in the class only and object can not access this var.
    int real;
    public String color;  // object can access this variable.

    void barking() {
        age = 15;
        System.out.println(age);
    }
}
