//public class MyGenericClass <T>{
public class MyGenericClass <T extends Number>{
    T x;

    MyGenericClass(T x) {
        this.x = x;
    }

    public T getValue() {
        return x;
    }

} // end of class
