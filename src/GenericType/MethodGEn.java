package GenericType;

public class MethodGEn {
//    void show(T t) {
//        System.out.println("Value is:" + t);
//    }

    static <T> void show1(T t) {
        System.out.println("Value is:" + t);
        System.out.println("Type is:" + t.getClass().getName());
    }

        // Defining a generic method to print any data type
        <T> void genericPrint(T t) {
            System.out.println(t);
        }


    public static void main(String[] args) {

        MethodGEn obj = new MethodGEn();
//        obj.show(new Integer(10));
//        obj.show(new String("Hello"));

        show1(10);
        show1("Hello");

        System.out.println("Generic Method----------------printing values");
        obj.genericPrint(101); // Calling generic method with int argument
        obj.genericPrint("Joy with Java"); // Calling generic method with String argument
        obj.genericPrint(3.1412343); // Calling generic method with double argument
    }
}
