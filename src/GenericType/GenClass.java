package GenericType;

class GenericClass<T> {
    T obj;

    GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}

public class GenClass {

    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<Integer>(88);
        System.out.println(intObj.getObject());

        GenericClass<String> strObj = new GenericClass<String>("Hello");
        System.out.println(strObj.getObject());
    }
}
