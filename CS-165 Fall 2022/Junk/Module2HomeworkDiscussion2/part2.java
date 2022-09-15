










public class part2 {


public static int rec(int [] list){
    return rec3(list, 0);
}

public static int rec3(int [] list, int start){
    if (start == list.length - 1) {
        return list[start];
    } else {
        return Math.max(list[start], rec3(list, start + 1));
    }
}

public static void main(String[] args) {

    int start = 0;
    int[] list = {1,3,5,7,9};
    System.out.println(rec3(list, start));


    } // end of main

} // end of class














