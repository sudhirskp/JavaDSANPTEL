package GenericType;

public class MethodGEn {
//    void show(T t) {
//        System.out.println("Value is:" + t);
//    }

    static <T> void show1(T t) {
        System.out.println("Value is:" + t);
        System.out.println("Type is:" + t.getClass().getName());
    }
    public static void main(String[] args) {

        MethodGEn obj = new MethodGEn();
//        obj.show(new Integer(10));
//        obj.show(new String("Hello"));

        show1(10);
        show1("Hello");
    }
}
