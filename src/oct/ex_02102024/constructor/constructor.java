package oct.ex_02102024.constructor;

public class constructor {
    public static void main(String[] args) {
        car tesla = new car();
        System.out.println(tesla.year);
        System.out.println(tesla.name);
        System.out.println(tesla.model);

        car nano= new car();
        nano.name = "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "tata.nano";
        System.out.println(nano.name);

    }
}
