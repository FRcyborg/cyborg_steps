/*
    Study for CS-165 third test.

    This part is from => https://www.youtube.com/watch?v=jUcAyZ5OUm0   => Bro Code, Java Generics ?

    20221006  -  JLF
*/

import java.util.ArrayList;

public class BroCodeGenerics {

    public static <T> void displayArray(T[] array) {
        for ( T x : array ) {
            System.out.print(x + " ");
        }
//        System.out.println();
    } // end of displayArray

    // from a study sheet:  Write a generic method to exchange the
    // positions of two different elements in an array:
    public static <T> T[]  swapThing(T[] array, int Location1, int Location2) {

        T tempThing = array[Location1];
        array[Location1] = array[Location2];
        array[Location2] = tempThing;

        return array;
    }
    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0];
    }


    public static void main(String[] args) {

        // sample arrays for testing:
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println("first thing of array => " + getFirst(intArray));
        System.out.println("first thing of array => " + getFirst(doubleArray));
        System.out.println("first thing of array => " + getFirst(charArray));
        System.out.println("first thing of array => " + getFirst(stringArray));

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
//        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
//        MyGenericClass<String> myString = new MyGenericClass<>("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
//        System.out.println(myChar.getValue());
//        System.out.println(myString.getValue());

// --------------------------------------------------------------------------------

        System.out.println("\nWrite a generic method to exchange the positions of two different elements in an array => ");
        System.out.print("Use this array => { ");
        displayArray(stringArray);
        System.out.print("}\n");

        swapThing(stringArray, 0, 1);

        System.out.print("We got this => { ");
        displayArray(stringArray);
        System.out.print("}\n");

// --------------------------------------------------------------------------------
/*
        // questions we got wrong on the quiz
        // double checking:
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("C");
        arr.add(0,"0");
        arr.add(2, "L");
        arr.remove(0);
        arr.add(1, "O");
        arr.add(1,"R");
        arr.remove(1);
        arr.add(3,"A");
        arr.set(2, "D");
        arr.set(2, "O");
        arr.remove(0);

        System.out.println();
        System.out.println(arr.indexOf("C"));
        System.out.println(arr.indexOf("O"));
        System.out.println(arr.indexOf("C")+arr.indexOf("O"));
        System.out.println();
        // stupid computer
        // other question we got wrong on the quiz:
        // ArrayList<String> ab = new ArrayList<String>();
        // oh, never mind, we just didn't read the question correctly
        // other thing wrong:
        // "The ArrayList class in Java is located at java.lang.ArrayList"
        // what they meant was, "what do you type to include array list, which should be:
        // java.util.ArrayList;
*/

    } // end of main
} // end of class
