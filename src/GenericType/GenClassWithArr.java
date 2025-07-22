package GenericType;

class GenericArrayClass<T> {
    T[] array;

    GenericArrayClass(T[] array) {
        this.array = array;
    }

    void printArray() {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class GenClassWithArr {


    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArrayClass<Integer> intArrayObj = new GenericArrayClass<Integer>(intArray);
        intArrayObj.printArray();

        String[] strArray = {"Hello", "World"};
        GenericArrayClass<String> strArrayObj = new GenericArrayClass<String>(strArray);
        strArrayObj.printArray();
    }
}
