public class compareStrings {

    public static void makeLine() { System.out.println("\n------------------------------------------------\n"); }

    public static void main(String[] args) {
        String str1 = "apples";
        String str2 = "oranges";
        String str3 = "apples";

        makeLine();
        
        System.out.println("str1 => " + str1);
        System.out.println("str2 => " + str2);
        System.out.println();


        System.out.println("str1.compareTo(str2) => " + str1.compareTo(str2));
        System.out.println("str1.equalsIgnoreCase(str2) => " + str1.equalsIgnoreCase(str2));
        System.out.println("str1.compareToIgnoreCase(str2) => " + str1.compareToIgnoreCase(str2));
        System.out.println("str1.equals(str2) => " + str1.equals(str2));
        System.out.println();
        System.out.println("str1.compareTo(str3) => " + str1.compareTo(str3));
        System.out.println("str1.equalsIgnoreCase(str3) => " + str1.equalsIgnoreCase(str3));
        System.out.println("str1.compareToIgnoreCase(str3) => " + str1.compareToIgnoreCase(str3));
        System.out.println("str1.equals(str3) => " + str1.equals(str3));
        System.out.println();
        System.out.println("str1.compareTo(str1) => " + str3.compareTo(str3));
        System.out.println("str1.equalsIgnoreCase(str1) => " + str3.equalsIgnoreCase(str3));
        System.out.println("str1.compareToIgnoreCase(str1) => " + str3.compareToIgnoreCase(str3));
        System.out.println("str1.equals(str1) => " + str1.equals(str3));
        System.out.println();
        makeLine();


    } // end of main
}  // end of class
