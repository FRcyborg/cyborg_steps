// Will the following class compile?  If not, why?

import java.util.List;

public class Algorithm {

// this one doesn't work because of the primitive use error
/*  comment this out

    public static <T> T max ( T x, T y) {
        return x > y ? x : y;
    }

    // looks like it will not compile.  I think this is because we are passing
    // primitive types in and trying to use them with generics, which is not
    // allowed
*/

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }


}

