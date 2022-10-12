import java.lang.reflect.Array;
import java.util.ArrayList;

public class whyNot <E>{

    ArrayList<E> someArray = new ArrayList<E>();

    whyNot() {
        ArrayList<String> someArray = new ArrayList<>(10);
    }

    whyNot(int cuantos) {
        ArrayList<String> someArray = new ArrayList<>(cuantos);
    }

    public void addtoarray(String s) {
        someArray.add(s);
    }

    public void showArray() {
        System.out.println("someArray => " + someArray);
    }
} // end of first class


