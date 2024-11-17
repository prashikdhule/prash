package oct.ex_02102024;
//with parameter and without return type
public class Lab24function3 {
    public static void main(String[] args) {
        greet_your_name("prashik");
        greet_your_name("prasad");
        greet_your_name("nikhil");
    }
    static void greet_your_name(String name){
        System.out.println("hi your name is " + name);
    }
}
