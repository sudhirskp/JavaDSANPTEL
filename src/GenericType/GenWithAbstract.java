package GenericType;

abstract class AbstractClass {
    abstract void display();
}

class ConcreteClass extends AbstractClass {
    void display() {
        System.out.println("ConcreteClass display method");
    }
}

class GenericAbstractClass<T extends AbstractClass> {
    T obj;

    GenericAbstractClass(T obj) {
        this.obj = obj;
    }

    void display() {
        obj.display();
    }
}
public class GenWithAbstract {

    public static void main(String[] args) {
            ConcreteClass concreteObj = new ConcreteClass();
            GenericAbstractClass<ConcreteClass> genericObj = new GenericAbstractClass<ConcreteClass>(concreteObj);
            genericObj.display();
    }
}
